package net.doomer.armorstand.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PosesList {
    public Map<String, Map<String, List<Integer>>> getPosesList() {
        Map<String, Map<String, List<Integer>>> posesList = new HashMap<>();
        posesList.put("1", oneListPose());
        posesList.put("2", twoListPose());
        posesList.put("3", threeListPose());
        posesList.put("4", fourListPose());
        posesList.put("5", fiveListPose());
        posesList.put("6", sixListPose());
        posesList.put("7", sevenListPose());
        posesList.put("8", eightListPose());
        posesList.put("9", nineListPose());
        posesList.put("10", tenListPose());
        posesList.put("11", elevenListPose());
        posesList.put("12", twelveListPose());
        posesList.put("13", thirteenListPose());

        return posesList;
    }

    private Map<String, List<Integer>> oneListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(0,0,0));
        listPose.put("leftLegPose", eulerToList(0,0,0));
        listPose.put("rightLegPose", eulerToList(0,0,0));
        listPose.put("leftArmPose", eulerToList(339,0,346));
        listPose.put("rightArmPose", eulerToList(339,0,15));
        return listPose;
    }

    private Map<String, List<Integer>> twoListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(0,0,0));
        listPose.put("leftLegPose", eulerToList(0,0,0));
        listPose.put("rightLegPose", eulerToList(0,0,0));
        listPose.put("leftArmPose", eulerToList(0,0,0));
        listPose.put("rightArmPose", eulerToList(0,0,0));
        return listPose;
    }

    private Map<String, List<Integer>> threeListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(14,0,0));
        listPose.put("leftLegPose", eulerToList(0,0,0));
        listPose.put("rightLegPose", eulerToList(0,0,0));
        listPose.put("leftArmPose", eulerToList(312,0,39));
        listPose.put("rightArmPose", eulerToList(312,0,323));
        return listPose;
    }

    private Map<String, List<Integer>> fourListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(356,0,0));
        listPose.put("leftLegPose", eulerToList(0,0,0));
        listPose.put("rightLegPose", eulerToList(0,0,0));
        listPose.put("leftArmPose", eulerToList(0,0,343));
        listPose.put("rightArmPose", eulerToList(282,0,0));
        return listPose;
    }

    private Map<String, List<Integer>> fiveListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(346,0,0));
        listPose.put("leftLegPose", eulerToList(11,0,353));
        listPose.put("rightLegPose", eulerToList(0,0,8));
        listPose.put("leftArmPose", eulerToList(31,0,353));
        listPose.put("rightArmPose", eulerToList(248,37,0));
        return listPose;
    }

    private Map<String, List<Integer>> sixListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(346,0,0));
        listPose.put("leftLegPose", eulerToList(11,0,353));
        listPose.put("rightLegPose", eulerToList(0,0,8));
        listPose.put("leftArmPose", eulerToList(254,37,0));
        listPose.put("rightArmPose", eulerToList(254,324,0));
        return listPose;
    }

    private Map<String, List<Integer>> sevenListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(346,0,0));
        listPose.put("leftLegPose", eulerToList(11,0,353));
        listPose.put("rightLegPose", eulerToList(0,0,8));
        listPose.put("leftArmPose", eulerToList(254,341,0));
        listPose.put("rightArmPose", eulerToList(241,40,0));
        return listPose;
    }

    private Map<String, List<Integer>> eightListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(0,0,0));
        listPose.put("leftLegPose", eulerToList(0,0,0));
        listPose.put("rightLegPose", eulerToList(0,0,0));
        listPose.put("leftArmPose", eulerToList(0,0,346));
        listPose.put("rightArmPose", eulerToList(309, 338, 15));
        return listPose;
    }

    private Map<String, List<Integer>> nineListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(356, 47, 0));
        listPose.put("leftLegPose", eulerToList(0,40, 350));
        listPose.put("rightLegPose", eulerToList(0,304,0));
        listPose.put("leftArmPose", eulerToList(18, 0, 353));
        listPose.put("rightArmPose", eulerToList(248, 47,0));
        return listPose;
    }

    private Map<String, List<Integer>> tenListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(14,23,0));
        listPose.put("leftLegPose", eulerToList(18, 141, 350));
        listPose.put("rightLegPose", eulerToList(349, 108,0));
        listPose.put("leftArmPose", eulerToList(0,0,225));
        listPose.put("rightArmPose", eulerToList(265, 334,0));
        return listPose;
    }

    private Map<String, List<Integer>> elevenListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,0,0));
        listPose.put("headPose", eulerToList(346, 348,0));
        listPose.put("leftLegPose", eulerToList(0,0,353));
        listPose.put("rightLegPose", eulerToList(315,0,0));
        listPose.put("leftArmPose", eulerToList(268, 13, 225));
        listPose.put("rightArmPose", eulerToList(268, 348,0));
        return listPose;
    }

    private Map<String, List<Integer>> twelveListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,355,0));
        listPose.put("headPose", eulerToList(356, 30,0));
        listPose.put("leftLegPose", eulerToList(238, 0, 306));
        listPose.put("rightLegPose", eulerToList(349, 33, 343));
        listPose.put("leftArmPose", eulerToList(0,0,242));
        listPose.put("rightArmPose", eulerToList(0,0,120));
        return listPose;
    }

    private Map<String, List<Integer>> thirteenListPose() {
        Map<String, List<Integer>> listPose = new HashMap<>();
        listPose.put("bodyPose", eulerToList(0,351,0));
        listPose.put("headPose", eulerToList(356, 324,0));
        listPose.put("leftLegPose", eulerToList(346, 0, 12));
        listPose.put("rightLegPose", eulerToList(248, 324, 343));
        listPose.put("leftArmPose", eulerToList(0,0,242));
        listPose.put("rightArmPose", eulerToList(0,0,120));
        return listPose;
    }

    private List<Integer> eulerToList(int one, int two, int three) {
        List<Integer> listEuler = new ArrayList<>();
        listEuler.add(one);
        listEuler.add(two);
        listEuler.add(three);
        return listEuler;
    }
}
