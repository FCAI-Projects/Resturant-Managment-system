/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package note;

import java.util.ArrayList;

/**
 *
 * @author elnopy
 */
public interface SetData {
    public boolean add();
    public boolean delete();
    public boolean update();
    public Object search();
    public ArrayList<Object> list();    
}