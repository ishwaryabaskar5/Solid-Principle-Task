public class Claim {
	
	private int claimId;
	private String claimType;
	private double claimAmount;
	
	public Claim() {
	}
	
	public Claim(int claimId, String claimType, double claimAmount) {
		this.claimId = claimId;
		this.claimType = claimType;
		this.claimAmount = claimAmount;
	}
	
	public int getClaimId() {
		return claimId;
	}
	
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	
	public String getClaimType() {
		return claimType;
	}
	
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	
	public double getClaimAmount() {
		return claimAmount;
	}
	
	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}
	
	public Claim fileClaim(Customer customer) {
		Claim claim = new Claim();
		System.out.println("Customer files the claim");
		return claim;
	}
	public String ValidateClaim(Claim claim,Surveyor surveyor) {
		boolean isValid=false;
		if(!isValid) {
			return "valid";
		}
		else
		{
			return "invalid";
		}
	}
	public boolean approveClaim(Claim claim,Manager manager){
		boolean isApproved = false;
		if(!isApproved) {
			return true;
		}
		else {
			return false;
		}
	}
}
