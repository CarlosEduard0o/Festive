package com.br.festive.demo.models.meetup;

public enum MeetupStageEnum {

    PUBLISHED("Published"),

    CANCELED("Canceled");

    private final String stage;

    MeetupStageEnum(String stage){
        this.stage = stage;
    }

    public String getStage(){
        return stage;
    }

    public static MeetupStageEnum fromString(String stage){
        for(MeetupStageEnum meetupStage : MeetupStageEnum.values()){
            if(meetupStage.getStage().equalsIgnoreCase(stage)){
                return meetupStage;
            }
        }
        throw new IllegalArgumentException("No enum constant for stage: " + stage);
    }

}
