
package gui;

import javax.swing.JFrame;

public class MockTacoTruck extends TacoTruck {

  private boolean initWasCalled = false;

  @Override
  public void init() {
    initWasCalled = true;
  }

  public boolean wasInitCalled(){
    return initWasCalled;
  }
}
