/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.8.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.starter.databus.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutomationActionPO
 */
@JsonPropertyOrder({
  AutomationActionPO.JSON_PROPERTY_ACTION_ID,
  AutomationActionPO.JSON_PROPERTY_ACTION_TYPE_ID,
  AutomationActionPO.JSON_PROPERTY_INPUT,
  AutomationActionPO.JSON_PROPERTY_PREV_ACTION_ID,
  AutomationActionPO.JSON_PROPERTY_ROBOT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutomationActionPO {
  public static final String JSON_PROPERTY_ACTION_ID = "actionId";
  private String actionId;

  public static final String JSON_PROPERTY_ACTION_TYPE_ID = "actionTypeId";
  private String actionTypeId;

  public static final String JSON_PROPERTY_INPUT = "input";
  private String input;

  public static final String JSON_PROPERTY_PREV_ACTION_ID = "prevActionId";
  private String prevActionId;

  public static final String JSON_PROPERTY_ROBOT_ID = "robotId";
  private String robotId;

  public AutomationActionPO() {
  }

  public AutomationActionPO actionId(String actionId) {
    
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getActionId() {
    return actionId;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  public AutomationActionPO actionTypeId(String actionTypeId) {
    
    this.actionTypeId = actionTypeId;
    return this;
  }

   /**
   * Get actionTypeId
   * @return actionTypeId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getActionTypeId() {
    return actionTypeId;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActionTypeId(String actionTypeId) {
    this.actionTypeId = actionTypeId;
  }


  public AutomationActionPO input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInput() {
    return input;
  }


  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInput(String input) {
    this.input = input;
  }


  public AutomationActionPO prevActionId(String prevActionId) {
    
    this.prevActionId = prevActionId;
    return this;
  }

   /**
   * Get prevActionId
   * @return prevActionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREV_ACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrevActionId() {
    return prevActionId;
  }


  @JsonProperty(JSON_PROPERTY_PREV_ACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevActionId(String prevActionId) {
    this.prevActionId = prevActionId;
  }


  public AutomationActionPO robotId(String robotId) {
    
    this.robotId = robotId;
    return this;
  }

   /**
   * Get robotId
   * @return robotId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROBOT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRobotId() {
    return robotId;
  }


  @JsonProperty(JSON_PROPERTY_ROBOT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRobotId(String robotId) {
    this.robotId = robotId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationActionPO automationActionPO = (AutomationActionPO) o;
    return Objects.equals(this.actionId, automationActionPO.actionId) &&
        Objects.equals(this.actionTypeId, automationActionPO.actionTypeId) &&
        Objects.equals(this.input, automationActionPO.input) &&
        Objects.equals(this.prevActionId, automationActionPO.prevActionId) &&
        Objects.equals(this.robotId, automationActionPO.robotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionTypeId, input, prevActionId, robotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationActionPO {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionTypeId: ").append(toIndentedString(actionTypeId)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    prevActionId: ").append(toIndentedString(prevActionId)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
