package com.nomis.client.widget.serverstatus;

import com.gwtplatform.mvp.client.UiHandlers;
import com.nomis.shared.model.ServerStatusInfo;
import com.nomis.shared.model.ServerStatus;

/**
 * ServerStatusUiHandlers.
 *
 * @author Aliaksei Labotski.
 * @since 4/14/18.
 */
public interface ServerStatusUiHandlers extends UiHandlers {

  void setServerStatusInfo(ServerStatusInfo serverStatusInfo);

  void getServerInfo();

  void setServerStatus(ServerStatus serverStatus);

  int getServerId();
}
