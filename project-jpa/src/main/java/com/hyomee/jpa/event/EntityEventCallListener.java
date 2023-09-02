package com.hyomee.jpa.event;

import jakarta.persistence.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

@Slf4j
public class EntityEventCallListener {

  @SneakyThrows
  @PrePersist
  public void prePersistDemoEntity(Object obj) {
    printLog("PrePersist", obj);
  }

  @SneakyThrows
  @PostPersist
  public void postPersisttDemoEntity(Object obj) {
    printLog("PostPersist", obj);
  }

  @SneakyThrows
  @PreRemove
  public void preRemoveDemoEntity(Object obj) {
    printLog("PreRemove", obj);
  }

  @SneakyThrows
  @PostRemove
  public void postRemoveDemoEntity(Object obj) {
    printLog("PostRemove", obj);
  }

  @SneakyThrows
  @PreUpdate
  public void preUpdateDemoEntity(Object obj) {
    printLog("PreUpdate", obj);
  }

  @SneakyThrows
  @PostUpdate
  public void postUpdateDemoEntity(Object obj) {
    printLog("PostUpdate", obj);
  }

  @SneakyThrows
  @PostLoad
  public void postLoadDemoEntity(Object obj) {
    printLog("PostLoad", obj);
  }

  @SneakyThrows
  private Method getToString(Object obj) {
    return  obj.getClass().getDeclaredMethod( "toSting");
  }

  @SneakyThrows
  private void printLog(String methodName, Object obj) {
    log.info( obj.getClass().getName() + " > "
            + methodName + " : "
            + obj.toString());
  }
}
