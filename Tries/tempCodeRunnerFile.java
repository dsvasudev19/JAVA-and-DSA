public static void main(String[] args) {
        TrieNode root=new TrieNode();
        insert("hello",root);
        insert("hey",root);
        insert("good",root);
        insert("goal",root);
        search("goods",root);
        search("goal",root);
    }

    private static boolean search(String key,TrieNode root) {
        TrieNode curr=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(curr.child[index]==null)
                return false;
            curr=curr.child[index];
        }
        return true;
    }

    private static void insert(String key,TrieNode root) {
        TrieNode curr=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(curr.child[index]==null){
                curr.child[index]=new TrieNode();
            }
            curr=curr.child[index];
        }
        curr.isEnd=true;
    }
}
