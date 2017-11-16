/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_FDA;

import grammar_things.C_Production;
import java.util.ArrayList;

/**
 *
 * @author devcrack
 */
public class C_Node {
    private ArrayList<C_Production> pseudo_grammar;
    private C_Node next_node;
    
    public C_Node() {
        this.pseudo_grammar = new ArrayList<C_Production>();
        this.next_node = null;
    }
    
}
