package com.nomis.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.nomis.client.application.ApplicationModule;
import com.nomis.client.application.error.ErrorModule;
import com.nomis.client.application.home.HomeModule;
import com.nomis.client.application.login.LoginModule;
import com.nomis.client.css.ResourceLoader;
import com.nomis.client.model.ModelModule;
import com.nomis.client.place.NameTokens;
import com.nomis.client.rest.RestModule;
import com.nomis.client.widget.loading.LoadingModule;
import com.nomis.client.widget.serverInfo.ServerInfoModule;

/**
 * ClientModule.
 *
 * @author Aliaksei Labotski.
 * @since 4/13/18.
 */
//@GwtpApp
public class ClientModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    install(new DefaultModule.Builder()
        .defaultPlace(NameTokens.getHome())
        .errorPlace(NameTokens.getError())
        .unauthorizedPlace(NameTokens.getLogin())
        .build());

    install(new ApplicationModule());
    install(new LoginModule());
    install(new HomeModule());
    install(new ErrorModule());
    install(new LoadingModule());
    install(new ServerInfoModule());

    install(new ModelModule());
    install(new RestModule());

    bind(ResourceLoader.class).asEagerSingleton();
  }
}
