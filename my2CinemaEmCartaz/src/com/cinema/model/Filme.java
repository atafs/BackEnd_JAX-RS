package com.cinema.model;

public class Filme {
	 //ATTRIBUTES
    private Long id;
    private String title;
    private String trailer;
    private String description;

    //CONSTRUCTOR
    public Filme(Long id, String title, String trailer, String description) {
        this.id = id;
        this.title = title;
        this.trailer = trailer;
        this.description = description;
    }
    
    public Filme(){
    	super();
    }
 
    //GETTERS AND SETTERS
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the trailer
     */
    public String getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
    	String toReturn = "";
    	toReturn += "id = " + id + "\n";
    	toReturn += "title = " + title + "\n";
    	toReturn += "trailer = " + trailer + "\n";
    	toReturn += "description = " + description + "\n";
    	return toReturn;
    }
}
