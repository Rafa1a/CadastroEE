/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.controller;
import javax.servlet.http.HttpServletRequest;


public abstract class Strategy<K> {
  protected final K facade;
  public Strategy(K facade) {
    this.facade = facade;
  }
  public abstract String executar(String acao,
      HttpServletRequest request);
}
