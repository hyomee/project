package com.hyomee.jpa.event;

import jakarta.persistence.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Slf4j
public class EntityEventCallListener {

  @SneakyThrows
  @PrePersist
  public void prePersistEntity(Object obj) {
    printLog("PrePersist", obj);
  }

  @SneakyThrows
  @PostPersist
  public void postPersisttEntity(Object obj) {
    printLog("PostPersist", obj);
  }

  @SneakyThrows
  @PreRemove
  public void preRemoveEntity(Object obj) {
    printLog("PreRemove", obj);
  }

  @SneakyThrows
  @PostRemove
  public void postRemoveEntity(Object obj) {
    printLog("PostRemove", obj);
  }

  @SneakyThrows
  @PreUpdate
  public void preUpdateEntity(Object obj) {
    printLog("PreUpdate", obj);
  }

  @SneakyThrows
  @PostUpdate
  public void postUpdateEntity(Object obj) {
    printLog("PostUpdate", obj);
  }

  @SneakyThrows
  @PostLoad
  public void postLoadEntity(Object obj) {
    printLog("PostLoad", obj);
  }


  @SneakyThrows
  private void printLog(String methodName, Object obj) {
    log.info( obj.getClass().getName() + " > "
            + methodName + " : "
            + obj);
  }
}
