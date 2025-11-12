package com.xworkz.enumaration.enums;

public enum State {
    ANDHRA_PRADESH("TCS, Infosys, Wipro, Tech Mahindra"),
    ARUNACHAL_PRADESH("Limited IT presence; growing startups in Itanagar"),
    ASSAM("TCS, Wipro, Tech Mahindra, NE Software Park companies"),
    BIHAR("HCL, Wipro, Tata Consultancy Services (expanding in Patna)"),
    CHHATTISGARH("Tech Mahindra, HCL, L&T Infotech"),
    GOA("Persistent Systems, Infosys, startups in Panaji"),
    GUJARAT("TCS, Wipro, Infosys, Cybage, L&T Technology Services"),
    HARYANA("Infosys, TCS, Wipro, Tech Mahindra, HCL Technologies (Gurugram)"),
    HIMACHAL_PRADESH("Small-scale IT firms in Shimla and Solan"),
    JHARKHAND("TCS, Wipro, Tech Mahindra in Ranchi"),
    KARNATAKA("Infosys, Wipro, TCS, Mindtree, IBM, Accenture (Bengaluru)"),
    KERALA("Infosys, TCS, UST Global, Wipro, IBS Software (Technopark, Kochi)"),
    MADHYA_PRADESH("TCS, Infosys, Impetus, Yash Technologies (Indore, Bhopal)"),
    MAHARASHTRA("TCS, Infosys, Wipro, Capgemini, Tech Mahindra, Cognizant (Pune, Mumbai)"),
    MANIPUR("Growing IT startups in Imphal"),
    MEGHALAYA("Emerging IT companies in Shillong"),
    MIZORAM("Small IT startups and e-Governance firms"),
    NAGALAND("Emerging IT services in Kohima"),
    ODISHA("Infosys, TCS, Wipro, Mindfire Solutions (Bhubaneswar)"),
    PUNJAB("Infosys, Tech Mahindra, Net Solutions (Mohali, Chandigarh)"),
    RAJASTHAN("Infosys, Wipro, Metacube, Genpact (Jaipur)"),
    SIKKIM("Few IT startups in Gangtok"),
    TAMIL_NADU("TCS, Infosys, Wipro, HCL, Cognizant, Zoho, Accenture (Chennai, Coimbatore)"),
    TELANGANA("TCS, Infosys, Tech Mahindra, Microsoft, Google, Amazon (Hyderabad)"),
    TRIPURA("TCS, small software startups in Agartala"),
    UTTAR_PRADESH("HCL, TCS, Wipro, Infosys, Tech Mahindra (Noida, Lucknow)"),
    UTTARAKHAND("HCL, Infosys, startups in Dehradun"),
    WEST_BENGAL("TCS, Wipro, Cognizant, IBM, Capgemini (Kolkata)"),
    DELHI("TCS, HCL, Tech Mahindra, Infosys, IBM, Oracle (NCR region)"),
    JAMMU_AND_KASHMIR("e-Governance startups and small IT firms in Jammu, Srinagar"),
    LADAKH("Emerging IT startups and innovation centers");

    private final String companies;

    State(String companies) {
        this.companies = companies;
    }

    public String getCompanies() {
        return companies;
    }
}
