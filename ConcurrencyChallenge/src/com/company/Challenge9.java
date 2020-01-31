package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by timbuchalka on 16/08/2016.
 */
public class Challenge9 {
    public static void main(String[] args) {
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class NewTutor {
    private NewStudent student;
    private Lock lock;

    public void setStudent(NewStudent student) {
        this.student = student;
        this.lock = new ReentrantLock();
    }

    public void studyTime() {

        lock.lock();
        try {
            System.out.println("Tutor has arrived");
            student.startStudy();
            System.out.println("Tutor is studying with student");
        } finally {
            lock.unlock();
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent {

    private NewTutor tutor;
    private Lock lock;

    NewStudent(NewTutor tutor) {
        this.tutor = tutor;
        this.lock = new ReentrantLock();
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        lock.lock();
        try {
            tutor.getProgressReport();
            // synchronized (this) {
            System.out.println("Student handed in assignment");
            // }
        } finally {
            lock.unlock();
        }
    }
}