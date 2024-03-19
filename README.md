# Sqat

а) The partitioning of the input parameters ensures that the partitions are disjoint. We have two input parameters, ukVisaApplications and usaVisaApplications, which represent the lists of applicants for UK and USA visas, respectively. These partitions are disjoint because an applicant can apply for either a UK visa, a USA visa, both, or none. There is no overlap between the applicants in the UK and USA visa application lists.

б) The partitioning of the input parameters ensures that the partitions cover the entire domain. The method covers all possible scenarios for visa applications: applicants applying for both UK and USA visas, applicants applying only for a UK visa, applicants applying only for a USA visa, and applicants not applying for any visa at all.

в) Base Choice Coverage (BCC) criterion ensures that each decision within the code is executed at least once. To satisfy this criterion, we can choose the base test where both ukVisaApplications and usaVisaApplications are not null and have applicants applying for both visas. Then, we need additional tests to cover the following cases:

Both input lists are null.
ukVisaApplications is null, and usaVisaApplications is not null.
ukVisaApplications is not null, and usaVisaApplications is null.
Both ukVisaApplications and usaVisaApplications are not null, but no applicants apply for both visas.
Both ukVisaApplications and usaVisaApplications are not null, and there are applicants who apply for both visas.
