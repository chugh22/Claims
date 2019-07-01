package pojo;

public class Claim {
	String id ;
	ClaimId claimId;
	Product product ;
	PatientName patientName ;
	Provider provider ;
	DateOfService dateOfService ;
	AmountBilled amountBilled ;
	DiscountAdjustment discountAdjustment ;
	YourResponsibility yourResponsibility ;
	IneligibleAmount ineligibleAmount ;
	PlanPaid planPaid ;
	CheckNumbers checkNumbers ;
	CheckIssueDate checkIssueDate ;
	State state ;
	Stage stage ;
	PaymentMode paymentMode ;
	QuickActionsStatus quickActionsStatus ;
	RecievedDate recievedDate ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ClaimId getClaimId() {
		return claimId;
	}
	public void setClaimId(ClaimId claimId) {
		this.claimId = claimId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public PatientName getPatientName() {
		return patientName;
	}
	public void setPatientName(PatientName patientName) {
		this.patientName = patientName;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public DateOfService getDateOfService() {
		return dateOfService;
	}
	public void setDateOfService(DateOfService dateOfService) {
		this.dateOfService = dateOfService;
	}
	public AmountBilled getAmountBilled() {
		return amountBilled;
	}
	public void setAmountBilled(AmountBilled amountBilled) {
		this.amountBilled = amountBilled;
	}
	public DiscountAdjustment getDiscountAdjustment() {
		return discountAdjustment;
	}
	public void setDiscountAdjustment(DiscountAdjustment discountAdjustment) {
		this.discountAdjustment = discountAdjustment;
	}
	public YourResponsibility getYourResponsibility() {
		return yourResponsibility;
	}
	public void setYourResponsibility(YourResponsibility yourResponsibility) {
		this.yourResponsibility = yourResponsibility;
	}
	public IneligibleAmount getIneligibleAmount() {
		return ineligibleAmount;
	}
	public void setIneligibleAmount(IneligibleAmount ineligibleAmount) {
		this.ineligibleAmount = ineligibleAmount;
	}
	public PlanPaid getPlanPaid() {
		return planPaid;
	}
	public void setPlanPaid(PlanPaid planPaid) {
		this.planPaid = planPaid;
	}
	public CheckNumbers getCheckNumbers() {
		return checkNumbers;
	}
	public void setCheckNumbers(CheckNumbers checkNumbers) {
		this.checkNumbers = checkNumbers;
	}
	public CheckIssueDate getCheckIssueDate() {
		return checkIssueDate;
	}
	public void setCheckIssueDate(CheckIssueDate checkIssueDate) {
		this.checkIssueDate = checkIssueDate;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public QuickActionsStatus getQuickActionsStatus() {
		return quickActionsStatus;
	}
	public void setQuickActionsStatus(QuickActionsStatus quickActionsStatus) {
		this.quickActionsStatus = quickActionsStatus;
	}
	public RecievedDate getRecievedDate() {
		return recievedDate;
	}
	public void setRecievedDate(RecievedDate recievedDate) {
		this.recievedDate = recievedDate;
	}
	
}
