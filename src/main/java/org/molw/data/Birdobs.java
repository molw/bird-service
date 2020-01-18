package org.molw.data;

import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Birdobs {

  @Id
  @Column(name = "global_unique_identifier")
  private String globalUniqueIdentifier;

  @Column(name = "taxonomic_order")
  private double taxonomicOrder;
  private String category;

  @Column(name = "common_name")
  private String commonName;

  @Column(name = "scientific_name")               
  private String scientificName;

  private String subspeciesCommonName;
  private String subspeciesScientificName;
  private long observationCount;
  private String breedingBirdAtlasCode;
  private String ageSex;
  private String country;
  private String countryCode;
  private String stateProvince;
  private String subnational1Code;
  private String county;
  private String subnational2Code;
  private String ibaCode;
  private String bcrCode;
  private String atlasBlock;
  private String locality;
  private String localityId;
  private String localityType;
  private Point location;
  private java.sql.Timestamp observationStart;
  private String observerId;
  private String firstName;
  private String lastName;
  private String samplingEventIdentifier;
  private String protocolType;
  private String projectCode;
  private long durationMinutes;
  private double effortDistanceKm;
  private double effortAreaHa;
  private long numberObservers;
  private String allSpeciesReported;
  private String groupIdentifier;
  private String approved;
  private String reviewed;
  private String reason;
  private String tripComments;
  private String speciesComments;


  public String getGlobal_Unique_Identifier() {
    return globalUniqueIdentifier;
  }

  public void setGlobal_Unique_Identifier(String globalUniqueIdentifier) {
    this.globalUniqueIdentifier = globalUniqueIdentifier;
  }


  public double getTaxonomic_order() {
    return taxonomicOrder;
  }

  public void setTaxonomic_order(double taxonomicOrder) {
    this.taxonomicOrder = taxonomicOrder;
  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public String getCommon_name() {
    return commonName;
  }

  public void setCommon_name(String commonName) {
    this.commonName = commonName;
  }


  public String getScientificName() {
    return scientificName;
  }

  public void setScientificName(String scientificName) {
    this.scientificName = scientificName;
  }


  public String getSubspeciesCommonName() {
    return subspeciesCommonName;
  }

  public void setSubspeciesCommonName(String subspeciesCommonName) {
    this.subspeciesCommonName = subspeciesCommonName;
  }


  public String getSubspeciesScientificName() {
    return subspeciesScientificName;
  }

  public void setSubspeciesScientificName(String subspeciesScientificName) {
    this.subspeciesScientificName = subspeciesScientificName;
  }


  public long getObservationCount() {
    return observationCount;
  }

  public void setObservationCount(long observationCount) {
    this.observationCount = observationCount;
  }


  public String getBreedingBirdAtlasCode() {
    return breedingBirdAtlasCode;
  }

  public void setBreedingBirdAtlasCode(String breedingBirdAtlasCode) {
    this.breedingBirdAtlasCode = breedingBirdAtlasCode;
  }


  public String getAgeSex() {
    return ageSex;
  }

  public void setAgeSex(String ageSex) {
    this.ageSex = ageSex;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  public String getSubnational1Code() {
    return subnational1Code;
  }

  public void setSubnational1Code(String subnational1Code) {
    this.subnational1Code = subnational1Code;
  }


  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }


  public String getSubnational2Code() {
    return subnational2Code;
  }

  public void setSubnational2Code(String subnational2Code) {
    this.subnational2Code = subnational2Code;
  }


  public String getIbaCode() {
    return ibaCode;
  }

  public void setIbaCode(String ibaCode) {
    this.ibaCode = ibaCode;
  }


  public String getBcrCode() {
    return bcrCode;
  }

  public void setBcrCode(String bcrCode) {
    this.bcrCode = bcrCode;
  }


  public String getAtlasBlock() {
    return atlasBlock;
  }

  public void setAtlasBlock(String atlasBlock) {
    this.atlasBlock = atlasBlock;
  }


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }


  public String getLocalityId() {
    return localityId;
  }

  public void setLocalityId(String localityId) {
    this.localityId = localityId;
  }


  public String getLocalityType() {
    return localityType;
  }

  public void setLocalityType(String localityType) {
    this.localityType = localityType;
  }


  public Point getLocation() {
    return location;
  }

  public void setLocation(Point location) {
    this.location = location;
  }
  
   
  public java.sql.Timestamp getObservationStart() {
    return observationStart;
  }

  public void setObservationStart(java.sql.Timestamp observationStart) {
    this.observationStart = observationStart;
  }


  public String getObserverId() {
    return observerId;
  }

  public void setObserverId(String observerId) {
    this.observerId = observerId;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getSamplingEventIdentifier() {
    return samplingEventIdentifier;
  }

  public void setSamplingEventIdentifier(String samplingEventIdentifier) {
    this.samplingEventIdentifier = samplingEventIdentifier;
  }


  public String getProtocolType() {
    return protocolType;
  }

  public void setProtocolType(String protocolType) {
    this.protocolType = protocolType;
  }


  public String getProjectCode() {
    return projectCode;
  }

  public void setProjectCode(String projectCode) {
    this.projectCode = projectCode;
  }


  public long getDurationMinutes() {
    return durationMinutes;
  }

  public void setDurationMinutes(long durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  public double getEffortDistanceKm() {
    return effortDistanceKm;
  }

  public void setEffortDistanceKm(double effortDistanceKm) {
    this.effortDistanceKm = effortDistanceKm;
  }


  public double getEffortAreaHa() {
    return effortAreaHa;
  }

  public void setEffortAreaHa(double effortAreaHa) {
    this.effortAreaHa = effortAreaHa;
  }


  public long getNumberObservers() {
    return numberObservers;
  }

  public void setNumberObservers(long numberObservers) {
    this.numberObservers = numberObservers;
  }


  public String getAllSpeciesReported() {
    return allSpeciesReported;
  }

  public void setAllSpeciesReported(String allSpeciesReported) {
    this.allSpeciesReported = allSpeciesReported;
  }


  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  public String getApproved() {
    return approved;
  }

  public void setApproved(String approved) {
    this.approved = approved;
  }


  public String getReviewed() {
    return reviewed;
  }

  public void setReviewed(String reviewed) {
    this.reviewed = reviewed;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public String getTripComments() {
    return tripComments;
  }

  public void setTripComments(String tripComments) {
    this.tripComments = tripComments;
  }


  public String getSpeciesComments() {
    return speciesComments;
  }

  public void setSpeciesComments(String speciesComments) {
    this.speciesComments = speciesComments;
  }

}
