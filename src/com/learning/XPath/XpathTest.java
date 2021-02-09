package com.learning.XPath;

import java.util.ArrayList;

public class XpathTest {

    public static void main(String[] args) {

        CaseNote caseNote = new CaseNote();

        caseNote.setNoteID((long) 1234);
        caseNote.setTitle("Forst CaseNOTe");

        TriggerRequestResource triggerRequestResource1 = new TriggerRequestResource();
        triggerRequestResource1.setAnswerId("HEalth123");
        triggerRequestResource1.setAnswerText("yes");
        triggerRequestResource1.setBusinessUnit("enter");
        triggerRequestResource1.setJobRole("JBR12");
        triggerRequestResource1.setPhiFlag(true);
        triggerRequestResource1.setQuestionId("Q123");
        triggerRequestResource1.setQuestionText("Have health porblem");
        triggerRequestResource1.setTreeId("123");
        triggerRequestResource1.setType("Secure");

        TriggerRequestResource triggerRequestResource2 = new TriggerRequestResource();

        triggerRequestResource2.setAnswerId("HEalth123");
        triggerRequestResource2.setAnswerText("no");
        triggerRequestResource2.setBusinessUnit("enter");
        triggerRequestResource2.setJobRole("JBR12");
        triggerRequestResource2.setPhiFlag(false);
        triggerRequestResource2.setQuestionId("Q123");
        triggerRequestResource2.setQuestionText("Have health porblem");
        triggerRequestResource2.setTreeId("123");
        triggerRequestResource2.setType("Secure");

        TriggerRequestResource triggerRequestResource3 = new TriggerRequestResource();

        triggerRequestResource3.setAnswerId("HEalth123");
        triggerRequestResource3.setAnswerText("yes");
        triggerRequestResource3.setBusinessUnit("enter");
        triggerRequestResource3.setJobRole("JBR12");
        triggerRequestResource3.setPhiFlag(true);
        triggerRequestResource3.setQuestionId("Q123");
        triggerRequestResource3.setQuestionText("Have health porblem");
        triggerRequestResource3.setTreeId("123");
        triggerRequestResource3.setType("Secure");

        ArrayList<TriggerRequestResource> triggerRequestResources = new ArrayList<>();

        triggerRequestResources.add(triggerRequestResource1);
        triggerRequestResources.add(triggerRequestResource2);
        triggerRequestResources.add(triggerRequestResource3);

        caseNote.setTriggerDetails(triggerRequestResources);


        String str = "$.notes[?(@.noteID==1234)].triggerDetails[1].answerText";

        Long noteID = 5678l;

        String triggerCount = "2";

        String str2 = "$.notes[?(@.noteID==%d})].triggerDetails[%d].answerText";

        String string = String.format(str2 , noteID, 2);

        System.out.println(string);
    }

}
