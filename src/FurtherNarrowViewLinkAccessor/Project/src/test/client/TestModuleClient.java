/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.client;

import oracle.jbo.client.remote.ApplicationModuleImpl;

import test.common.TestModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TestModuleClient extends ApplicationModuleImpl implements TestModule {
  /**This is the default constructor (do not remove)
   */
  public TestModuleClient() {
  }
  public void test() {
    Object _ret = this.riInvokeExportedMethod(this,"test",null,null);
    return;
  }
}
