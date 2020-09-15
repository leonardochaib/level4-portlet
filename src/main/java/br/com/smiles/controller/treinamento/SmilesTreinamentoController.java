package br.com.smiles.controller.treinamento;

import br.com.smiles.helper.PortletUtil;
import br.com.smiles.service.treinamento.TreinamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.portlet.PortletRequest;

@Controller("smiles-treinamento-portlet")
@RequestMapping("View")
public class SmilesTreinamentoController {

    private static final String VIEW           = "/treinamento/index";
    private static final String TREINAMENTO_VO = "treinamento";

    @Autowired
    private TreinamentoService treinamentoService;

    @RenderMapping
    public ModelAndView handleRenderRequest(ModelAndView modelAndView, PortletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.addObject(TREINAMENTO_VO,treinamentoService.getTreinamentoInfo(PortletUtil.getMemberNumber(request)));
        mv.setView(VIEW);
        return mv;
    }

}
