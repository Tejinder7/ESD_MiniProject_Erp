package com.example.miniprojecterp.Controller;

import com.example.miniprojecterp.Bean.Bill;
import com.example.miniprojecterp.Bean.Student;
import com.example.miniprojecterp.Bean.Student_Payment;
import com.example.miniprojecterp.Services.BillService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("/bills")
public class BillController {
    @POST
    @Path("/add/{desc}/{amt}/{date}/{dead}/{id}")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_HTML)
    public Response add_bill(@PathParam("desc") String descrption, @PathParam("amt") int amount,@PathParam("date") String date,@PathParam("dead") String deadline ,@PathParam("id") int id) throws URISyntaxException {
        String result = "Added Bill";
        System.out.println(result);
        BillService service = new BillService();
        Student student = service.getStudentId(id);
        service.addNewSingleBill(descrption, amount, date, deadline, student);

        System.out.println(result);
        return Response.status(200).entity(result).build();
    }

    @POST
    @Path("/add/domain/{desc}/{amt}/{date}/{dead}/{id}")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_HTML)
    public Response add_bill_to_domain(@PathParam("desc") String descrption, @PathParam("amt") int amount,@PathParam("date") String date,@PathParam("dead") String deadline ,@PathParam("id") int id) throws URISyntaxException {
        String result = "Added Bill";
        System.out.println(result);
        BillService service = new BillService();
        List<Student> students = service.getStudentList(id);

        for(Student s: students){
            service.addNewSingleBill(descrption, amount, date, deadline, s);
        }
        System.out.println(result);
        return Response.status(200).entity(result).build();
    }

    @POST
    @Path("/updateamt/{id}/{amount}")
    @Produces(MediaType.TEXT_HTML)
    public Response update_bill_amount(@PathParam("id") int billid, @PathParam("amount") int amt) throws URISyntaxException {
        BillService service = new BillService();
        service.updateBillAmount(billid, amt);
        String result = "Updated Bill Amount";
        return Response.status(200).entity(result).build();
    }

    @POST
    @Path("/updatedeadline/{id}/{date}")
    @Produces(MediaType.TEXT_HTML)
    public Response update2_bill(@PathParam("id") int billId, @PathParam("date") String deadline) throws URISyntaxException {
        BillService service = new BillService();
        service.updateBillDead(billId, deadline);
        String result = "Updated Bill Date";
        return Response.status(200).entity(result).build();
    }

    @POST
    @Path("/delete/{billid}")
    @Produces(MediaType.TEXT_HTML)
    public Response delete_bill(@PathParam("billid") int id) throws URISyntaxException {
        BillService service = new BillService();
        service.deleteBill(id);
        String result = "Delete Bill";
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("viewAllBills")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewAll(){
        List<Bill> billsList  = new ArrayList<>();
        BillService service = new BillService();
        billsList = service.viewAllBills();
        //GenericEntity<List<Bill>> genericEntity = new GenericEntity<List<Bill>>(billsList){};
        return Response.ok().entity(billsList).build();
    }

    @GET
    @Path("viewPaid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewPaid(){
        List<Bill> paymentList  = new ArrayList<>();
        BillService service = new BillService();
        paymentList = service.viewPaidBills();
        //GenericEntity<List<Bill>> genericEntity = new GenericEntity<List<Bill>>(billsList){};
        return Response.ok().entity(paymentList).build();
    }

    @GET
    @Path("viewUnpaid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewunPaid(){
        List<Bill> unpaidBillsList  = new ArrayList<>();
        BillService service = new BillService();
        unpaidBillsList = service.viewUnpaidBills();
        //GenericEntity<List<Bill>> genericEntity = new GenericEntity<List<Bill>>(billsList){};
        return Response.ok().entity(unpaidBillsList).build();
    }
}
