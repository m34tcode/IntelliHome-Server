/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Josh_2
 */
public abstract interface TransactionResponseListener {
    public abstract void onResponseSet(Transaction tran, Integer modID, String response);
}
