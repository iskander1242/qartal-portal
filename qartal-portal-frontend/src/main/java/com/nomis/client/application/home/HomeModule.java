package com.nomis.client.application.home;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.nomis.client.application.login.LoginConstants;

/**
 * HomeModule.
 *
 * @author Aliaksei Labotski.
 * @since 4/13/18.
 */
public class HomeModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    bindPresenter(HomePresenter.class, HomePresenter.MyView.class, HomeView.class, HomePresenter.MyProxy.class);

    bind(HomeConstants.class).asEagerSingleton();
  }

}
