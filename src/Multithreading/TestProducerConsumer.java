package Multithreading;

public class TestProducerConsumer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(new Producerthread(buffer));
        Thread consumer = new Thread(new ConsumerThread(buffer));

        producer.start();
        consumer.start();
    }
}
