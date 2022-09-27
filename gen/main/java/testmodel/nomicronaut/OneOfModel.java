package testmodel.nomicronaut;

@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION, visible = true)
@com.fasterxml.jackson.annotation.JsonSubTypes({
   @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = FirstModel.class),
   @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SecondLevelModel.class)})
public interface OneOfModel{}

