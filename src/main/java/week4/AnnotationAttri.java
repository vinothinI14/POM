package week4;

import org.testng.annotations.Test;

import week2.CreateLeads;
import week2.DeleteSeM;
import week2.DuplicateSeM;
import week2.EditLeadSeM;
import week2.MergeLeadSeM;

public class AnnotationAttri {
	@Test(invocationCount=2)
	public void createLead()
	{
	CreateLeads lead = new CreateLeads();
//	lead.create();
	}
	@Test(dependsOnMethods= {"createLead"})
	public void editLead()
	{
		EditLeadSeM eLead=new EditLeadSeM();
		eLead.edit();
	}
	@Test(invocationTimeOut=200000)
	public void MergeLeads() throws InterruptedException
	{
		MergeLeadSeM mLead=new MergeLeadSeM();
		mLead.merge();
	}
	@Test(dependsOnMethods= {"createLead"})
	public void deleteLead() throws InterruptedException
	{
		DeleteSeM dLead=new DeleteSeM();
		dLead.delete();
	}
	@Test(enabled=false)
	public void duplicateLead() throws InterruptedException
	{
		DuplicateSeM dupliLead=new DuplicateSeM();
		dupliLead.duplicate();
				
	}
}
