package io;

public class DashaMap2 implements HashMapX {
    private Node[] hArr;

    public DashaMap2() {
        hArr = new Node[26];
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char temp = (char) (a + i);
            Character alpha = temp;
            hArr[i] = new Node(alpha.toString(),null,null);
        }
    }

    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            if(input.length() == 1){
                return (String.valueOf(input.charAt(0)).toLowerCase());
            }
            return (String.valueOf(input.charAt(1)).toLowerCase());
        }
        return null;
    }



    public Node[] getHashArray() {
        return hArr;
    }


    public void set(String key, Integer value) {
        String hashKey = HashFunctionTwo(key);
        Node n = new Node(key,value,null);
        append(hashKey,n);
    }

    public void append(String key, Node n){
        for (int i = 0; i < hArr.length; i++) {
            if(hArr[i].getKey().equals(key)){
                Node temp = hArr[i];
                while (temp.getNext() != null){
                    temp = temp.getNext();
                }
                temp.setNext(n);
            }
        }
    }

    public void delete(String key) {
        String hashKey = HashFunctionTwo(key);
        removeIn(hashKey,key);
    }

    public void removeIn(String hashKey, String key){
        for (int i = 0; i < hArr.length; i++) {
            if (hArr[i].getKey().equals(hashKey)) {
                Node temp = hArr[i];
                Node connector = hArr[i];
                while ((temp.getNext() != null) && (!temp.getKey().equals(key))) {
                    connector = temp;
                    temp = temp.getNext();
                }
                connector.setNext(temp.getNext());
                temp.setNext(null);
            }
        }
    }

    public Integer get(String key) {
        String hashKey = HashFunctionTwo(key);
        Node n = searchIn(hashKey,key);
        return n.getValue();
    }

    public Node searchIn(String keyHash, String key) {
        for (int i = 0; i < hArr.length; i++) {
            if(hArr[i].getKey().equals(keyHash)){
                Node temp = hArr[i];
                while (!temp.getKey().equals(key)){
                    temp = temp.getNext();
                }
                return temp;
            }
        }
        return null;
    }

    public boolean isEmpty() {

        return hArr.length==0;
    }

    public long size() {
        long count = 0;
        char a = 'a';
        for (int i = 0; i < hArr.length; i++) {
            char temp = (char) (a+i);
            Character alpha = temp;
            count+= bucketSize(alpha.toString());
        }
        return count;
    }

    public int bucketSize(String hashKey) {
        int count = 0;
        hashKey = HashFunctionTwo(hashKey);
        for (int i = 0; i < hArr.length; i++) {
            if(hArr[i].getKey().equals(hashKey)){
                Node temp = hArr[i];
                while (temp.getNext() != null){
                    temp = temp.getNext();
                    count++;
                }
            }
        }
        return count;
    }
}
