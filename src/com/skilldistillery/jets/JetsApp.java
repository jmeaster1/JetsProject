package com.skilldistillery.jets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JetsApp {
	Hangar hangar;
	Barracks barracks;

	public static void main(String[] args) {
		JetsApp jetsApp = new JetsApp();
		jetsApp.runApp();
	}

	public void runApp() {
		hangar = new Hangar();
		barracks = new Barracks();
		initializeHangarAndBarracks();
		Scanner kb = new Scanner(System.in);
		String choice;
		int intChoice;
		do {
			System.out.println("Please enter your choice:");
			choice = kb.next();
			try {
				intChoice = Integer.parseInt(choice);
				switch (intChoice) {
				case 1:
					listFleet();
					break;
				case 2:
					showFastestJet();
					break;
				case 3:
					showMaxRangeJet();
					break;
				case 4:// addJet();
					break;
				case 5:// quit();
					break;
				}
			} catch (NumberFormatException e) {
				intChoice = 1;
				System.out.println("Please enter an integer:");
			}
		} while (intChoice > 0 && intChoice < 5);

	}

	public void initializeHangarAndBarracks() {
		hangar = new Hangar();
		Jet[] jets = new Jet[5];
		Pilot[] pilots = new Pilot[5];
		pilots[0] = new Pilot("Maverick", 31, 8);
		pilots[1] = new Pilot("Goose", 30, 7);
		pilots[2] = new Pilot("Ice Man", 32, 10);
		pilots[3] = new Pilot("Red Baron", 45, 20);
		pilots[4] = new Pilot("Launchpad McQuack", 42, 30);

		jets[0] = new Jet("C-130", 368.0, 2361.0, 60_000, pilots[0]);
		jets[1] = new Jet("C-17", 500.0, 6456.0, 181_054, pilots[1]);
		jets[2] = new Jet("C-5", 500.0, 7273.1, 240_000, pilots[2]);
		jets[3] = new Jet("KC-135", 580.0, 1503.0, 203_000, pilots[3]);
		jets[4] = new Jet("B-52", 644.0, 8800.0, 312_197, pilots[4]);

		hangar.setJets(jets);
		barracks.setPilots(pilots);

	}

	public void listFleet() {
		Jet[] jets = hangar.getJets();
		for (int i = 0; i < jets.length; i++) {
			System.out.println(jets[i]);
		}

	}

	public void showFastestJet() {
		Jet[] jets = hangar.getJets();
		Jet fastJet = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (fastJet.getSpeed() < jets[i].getSpeed()) {//
				fastJet = jets[i];
			}
		}
		System.out.println(fastJet);
	}

	public void showMaxRangeJet() {
		Jet[] jets = hangar.getJets();
		Jet maxRangeJet = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (maxRangeJet.getRange() < jets[i].getRange()) {
				maxRangeJet = jets[i];
			}

		}
		System.out.println(maxRangeJet);

	}

	public void addJet() {

	}

	public void quit() {

	}

}