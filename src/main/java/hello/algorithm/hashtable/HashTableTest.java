package hello.algorithm.hashtable;

import java.util.LinkedList;

class HashTable{
    class Node{
        String key;
        String value;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
        //getValue
        String value() {
            return value;
        }
        //setValue
        void value(String value) {
            this.value = value;
        }
    }
    LinkedList<Node>[] data;

    //HashTable size 설정
    HashTable(int size) {
        this.data = new LinkedList[size];
    }

    //key를 받아서 hashcode로 반환
    int getHashCode(String key){
        int hashcode = 0;

        // char별 아스키코드 값 더해줌
        for (char c: key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }

    //hashcode를 받아서 배열의 인덱스에 저장
    int convertToIndex(int hashcode){
        return hashcode % data.length;
    }

    //검색 키로 해당 노드를 찾음
    Node serchKey(LinkedList<Node> list, String key) {
        for(Node node : list) {
            if(node.key.equals(key)){
                return node;
            }
        }
        return null;
    }

    //데이터를 받아서 저장하는 함수
    void put(String key, String value){
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        System.out.println(key + "hashcode = (" + hashcode + "), " + "index = (" + index + ")");
        LinkedList<Node> list = data[index];    //index 번호로 배열 리스트 가져옴
        if(list == null){
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = serchKey(list, key);
        if (node == null){
            list.addLast(new Node(key, value)); //node방이 null이면 객체 생성후 node추가
        }else {
            node.value(value);  //방에 노드가 있으면 새로 들어온 값으로 대체
        }
    }

    String get(String key){
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = serchKey(list, key);
        return node == null?"Not found" : node.value();
    }
}

public class HashTableTest {
    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("sung", "he is handsome");
        h.put("jin", "she is model");
        h.put("hee", "she is beautiful");
        h.put("min", "she is angel");
        h.put("sung", "he is awesome");
        System.out.println(h.get("sung"));
        System.out.println(h.get("jin"));
        System.out.println(h.get("hee"));
        System.out.println(h.get("min"));
        System.out.println(h.get("jae"));
    }
}
