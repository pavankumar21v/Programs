package com.exception;

/*
Any order holds good
Error -> Exception -> Throwable
Exception -> Error -> Throwable
 */

public class Order {
    public static void main(String args[]) {
        try {
        } catch (Error e) {
        } catch (Exception er) {
        } catch (Throwable t) {
        }
    }
}
