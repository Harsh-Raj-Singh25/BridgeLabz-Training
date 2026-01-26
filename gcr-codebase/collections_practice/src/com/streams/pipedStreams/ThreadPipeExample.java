package com.streams.pipedStreams;

import java.io.*;

public class ThreadPipeExample {
	public static void main(String[] args) throws IOException {
		//   Create the input and output pipes
		final PipedOutputStream output = new PipedOutputStream();
		final PipedInputStream input = new PipedInputStream(output); // Connected!

		// Producer Thread: Writes data into the pipe
		Thread producer = new Thread(() -> {
			try {
				String message = "Hello from the Producer Thread!";
				System.out.println("Producer: Sending data...");
				output.write(message.getBytes());
				output.close(); // Important to close so consumer knows it's done
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		//   Consumer Thread: Reads data from the pipe
		Thread consumer = new Thread(() -> {
			try {
				int data;
				System.out.print("Consumer: Receiving data -> ");
				while ((data = input.read()) != -1) {
					System.out.print((char) data);
				}
				System.out.println();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		//   Start both threads
		producer.start();
		consumer.start();
	}
}