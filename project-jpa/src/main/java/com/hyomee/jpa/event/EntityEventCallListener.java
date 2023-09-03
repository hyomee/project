package com.hyomee.jpa.event;

import jakarta.persistence.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Slf4j
public class EntityEventCallListener {

  @PrePersist
  public void prePersistEntity(Object obj) {
    printLog("PrePersist", obj);
  }

  @PostPersist
  public void postPersisttEntity(Object obj) {
    printLog("PostPersist", obj);
  }

  @PreRemove
  public void preRemoveEntity(Object obj) {
    printLog("PreRemove", obj);
  }

  @PostRemove
  public void postRemoveEntity(Object obj) {
    printLog("PostRemove", obj);
  }

  @PreUpdate
  public void preUpdateEntity(Object obj) {
    printLog("PreUpdate", obj);
  }

  @PostUpdate
  public void postUpdateEntity(Object obj) {
    printLog("PostUpdate", obj);
  }

  @PostLoad
  public void postLoadEntity(Object obj) {
    printLog("PostLoad", obj);
  }


  private void printLog(String methodName, Object obj) {
    log.info( obj.getClass().getName() + " > "
            + methodName + " : "
            + obj);
  }
}
