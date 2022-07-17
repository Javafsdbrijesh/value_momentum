package com.javafsd.jwt.model;

public class JwtResponse {
private String jwttocken;

/**
 * @return the jwttocken
 */
public String getJwttocken() {
	return jwttocken;
}

/**
 * @param jwttocken the jwttocken to set
 */
public void setJwttocken(String jwttocken) {
	this.jwttocken = jwttocken;
}

public JwtResponse(String token) {
	
}

@Override
public String toString() {
	return "JwtResponse [jwttocken=" + jwttocken + "]";
}

}
