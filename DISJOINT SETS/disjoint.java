/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;

class DisjointSet{
    List<Integer> rank=new ArrayList<Integer>();
    List<Integer> parent=new ArrayList<Integer>();
    DisjointSet(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
        }
    }
    int findPar(int node){
        if(node==parent.get(node)){
            return node;
        }
        int up=findPar(parent.get(node));
        parent.set(node,up);
        return parent.get(node);
    }
    void unionByRank(int u,int v){
        int pu=findPar(u);
        int pv=findPar(v);
        if(pv==pu) return;
        if(rank.get(pu) > rank.get(pv)){
            parent.set(pv,pu);
        }else if(rank.get(pu) < rank.get(pv)){
            parent.set(pu,pv);
        }else{
            parent.set(pu,pv);
            int rankU=rank.get(pu);
            rank.set(pu,rankU+1);
        }
    }
}
public class disjoint {
	public static void main (String[] args) {
		DisjointSet ds=new DisjointSet(7);
		ds.unionByRank(1,2);
		ds.unionByRank(2,3);
		ds.unionByRank(4,5);
		ds.unionByRank(6,7);
		ds.unionByRank(5,6);
		if(ds.findPar(3)==ds.findPar(7)){
		    System.out.println("SAME");;
		}
		else{
		    System.out.println("NOT SAME");
		}
		ds.unionByRank(3,7);
		if(ds.findPar(3)==ds.findPar(7)){
		    System.out.println("SAME");;
		}
		else{
		    System.out.println("NOT SAME");
		}
		
	}
}