package it.sincrono.corso.model;

public class Actor {

	
		private String First_Name;
		private String Name;
		private String actor_id;
		
		public String getActor_id() {
			return actor_id;
		}

		public void setActor_id(String actor_id) {
			this.actor_id = actor_id;
		}

		public Actor() {
		}

		public String getFirst_Name() {
			return First_Name;
		}

		public void setFirst_Name(String first_Name) {
			First_Name = first_Name;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}
		
}
