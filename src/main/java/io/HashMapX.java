package io;

 interface HashMapX {

    // fundamentals
    public void set(String key, Integer value);
    public void delete(String key);
    public Integer get(String key);
    public boolean isEmpty();
    public long size();

    // testing access
    int bucketSize(String key); // used for tests
}


