public class Resume {

  private String mPosition;
  private String mCompanyName;
  private String mCompanyLocation;
  private String mDescription;
  private String mDatesOfEmployment;

  public Resume(String _position, String _companyName, String _companyLocation, String _description, String _datesOfEmployment) {
    mPosition = _position;
    mCompanyName = _companyName;
    mCompanyLocation = _companyLocation;
    mDescription = _description;
    mDatesOfEmployment = _datesOfEmployment;
  }

  public String getPosition() {
    return mPosition;
  }

  public String getCompanyName() {
    return mCompanyName;
  }

  public String getCompanyLocation() {
    return mCompanyLocation;
  }

  public String getDescription() {
    return mDescription;
  }

  public String getDatesOfEmployment() {
    return mDatesOfEmployment;
  }
}
