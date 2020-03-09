package io;

public class DashaMap1 implements HashMapX {
    private Node[] hArr;

    public DashaMap1() {
        hArr = new Node[26];
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char temp = (char) (a + i);
            Character alpha = temp;
            hArr[i] = new Node(alpha.toString(),null,null);
        }
    }

    public Node[] getHashArray() {
        return hArr;
    }


    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(0))).toLowerCase();
        }
        return null;
    }

    public void set(String key, String value) {

    }

    public String delete(String key) {
        return null;
    }

    public String get(String key) {
        return null;
    }

    public boolean isEmpty() {
        return hArr.length==0;
    }

    public long size() {
        return hArr.length;
    }

    public boolean bucketSize(String key) {
        return false;
    }


}
