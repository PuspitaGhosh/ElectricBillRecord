package controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;   
import bean.Elec;
import dao.ElecDao; 
@Controller
public class ElecController {
	@Autowired
	ElecDao dao;
	@RequestMapping(value="/elecform" , method=RequestMethod.GET)
	public String showform(Model m)
	{
		m.addAttribute("command",new Elec());
		return "elecform";
	}
	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public String save(@ModelAttribute("elec") Elec elec)
    {  
        dao.save(elec);  
        return "redirect:/viewelec";//will redirect to viewelec request mapping  
    }  
    
    /* It provides list of bill in model object */  
    @RequestMapping("/viewelec")  
    public String viewelec(Model m)
    {  
        List<Elec> list=dao.getBill();  
        m.addAttribute("list",list);
        return "viewelec";  
    }
    
    @RequestMapping(value="/editbill/{conId}")  
    public String edit(@PathVariable int conId, Model m)
    {  
        Elec elec=dao.getElecById(conId);  
        m.addAttribute("command",elec);
        return "eleceditform";  
    }  
 
 @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("elec") Elec elec)
    {  
        dao.update(elec);  
        return "redirect:/viewelec";  
    }
 
 @RequestMapping(value="/deletebill/{conId}",method = RequestMethod.GET)  
    public String delete(@PathVariable int conId){  
        dao.delete(conId);  
        return "redirect:/viewelec";  
    }

}
