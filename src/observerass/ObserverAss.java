/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerass;

/**
 *
 * @author Johannes
 */
public class ObserverAss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create one subject
        Subject subject = new Subject();
        String[] names = {"first", "second", "third"};
        for (int i = 0; i < 3; i++) {
            IObserver observer = new ConcreteObserver(subject, names[i]);
        }
        for (int i = 0; i < 5; i++) {
            subject.event();
        }
        
    }

}
