package com.eleicao;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eleicao.model.Candidato;
import com.eleicao.model.Eleitor;
import com.eleicao.model.Municipio;
import com.eleicao.model.Voto;
import com.eleicao.model.Zona;
import com.eleicao.repository.CandidatoRepository;
import com.eleicao.repository.EleitorRepository;
import com.eleicao.repository.MunicipioRepository;
import com.eleicao.repository.VotoRepository;
import com.eleicao.repository.ZonaRepository;

@SpringBootApplication

public class EleicaoApplication implements CommandLineRunner {

	final MunicipioRepository _municipioRepository; // Criando propriedade da Interface Município
	final EleitorRepository _eleitorRepository;
	final CandidatoRepository _candidatoRepository;
	final VotoRepository _votoRepository;
	final ZonaRepository _zonaRepository;

	public EleicaoApplication(MunicipioRepository municipioRepository, EleitorRepository eleitorRepository,
			CandidatoRepository candidatoRepository, VotoRepository votoRepository, ZonaRepository zonaRepository) {
		_municipioRepository = municipioRepository; // Alimentando a propriedade com a construção da classe
		_eleitorRepository = eleitorRepository;
		_candidatoRepository = candidatoRepository;
		_votoRepository = votoRepository;
		_zonaRepository = zonaRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// SAVE MUNICIPIO
//		}--------------------------------------------------------------------
//		Municipio municipio = new Municipio();
//		municipio.setNome("Diadema");
//		municipio.setPopulacao(100);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		

//	    
//		Municipio municipio = new Municipio();
//		municipio.setNome("Sao bernardo");
//		municipio.setPopulacao(300000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		

		// SAVE CANDIDATO
//   }-------------------------------------------------------------------------
//		Candidato candidato = new Candidato();
//		Municipio municipio = new Municipio();
//		municipio.setId(1L);
//		candidato.setNome("Reinaldo Meira");
//		candidato.setnNumero("25656");
//		candidato.setTipo("Vereador");
//		candidato.setMunicipio(municipio);
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato salvo");
//		

//		Candidato candidato = new Candidato();
//		Municipio municipio = new Municipio();
//		municipio.setId(1L);
//		candidato.setNome("Lobao");
//		candidato.setnNumero("40666");
//		candidato.setTipo("Vereador");
//		candidato.setMunicipio(municipio);
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato salvo");

		// SAVE ZONA
//}-----------------------------------------------------------------------------

//	Zona zona = new Zona();
//	zona.setNome("334");
//	_zonaRepository.save(zona);
//	

//	Zona zona = new Zona();
//	zona.setNome("558");
//	_zonaRepository.save(zona);

//}-----------------------------------------------------------------------------		

		// SAVE ELEITOR
//}-----------------------------------------------------------------------------

//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("Silvio");
//		_eleitorRepository.save(eleitor);

//
//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("Maria");
//		_eleitorRepository.save(eleitor);
//		

//}----------------------------------------------------------------		

		// SAVE VOTO
		// }-----------------------------------------------------------------------------

//		
//		Voto voto = new Voto();
//		Candidato candidato = new Candidato();
//		candidato.setId(1l);
//		voto.setCandidato(candidato);
//        Zona zona = new Zona();
//		zona.setId(1l);
//		voto.setZona(zona);
//        Eleitor eleitor = new Eleitor();
//		eleitor.setId(1L);
//		voto.setEleitor(eleitor);

//		Voto voto = new Voto();
//		Candidato candidato = new Candidato();
//		candidato.setId(2l);
//		voto.setCandidato(candidato);
//        Zona zona = new Zona();
//		zona.setId(2l);
//		voto.setZona(zona);
//        Eleitor eleitor = new Eleitor();
//		eleitor.setId(2L);
//		voto.setEleitor(eleitor);
//		
//		_votoRepository.save(voto);

//}----------------------------------------------------------------		

		// DELETE MUNICIPIO
		// }----------------------------------------------------------------

		// Deletando um município

//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(1));
//		_municipioRepository.delete(municipio);
//		System.out.println("Município deletado com sucesso!");
//		

		// }----------------------------------------------------------------------

		// DELETE CANDIDATO
		// }-------------------------------------------------------------------------
//		Candidato candidato = new Candidato();
//		candidato.setId(new Long (1));
//		_candidatoRepository.delete(candidato);
//		System.out.println("Deletando Candidato");
//		
		// }-------------------------------------------------------------------------

		// DELETE VOTO
		// }-------------------------------------------------------------------------
//		Voto voto = new Voto();
//		voto.setId(new Long(1));
//		_votoRepository.delete(voto);
//		System.out.println("Deletando voto");
//		
		// }-------------------------------------------------------------------------

		// DELETE ZONA
		// }-------------------------------------------------------------------------
//		Zona zona = new Zona();
//		zona.setId(new Long (1));
//		_zonaRepository.delete(zona);
//		System.out.println("Deletando zona");
////		
		// }-------------------------------------------------------------------------

		// DELETE ELEITOR
		// }-------------------------------------------------------------------------

//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long (1));
//		_eleitorRepository.delete(eleitor);
//		System.out.println("Deletando Candidato");
//		

		// }-------------------------------------------------------------------------

		// ATUALIZANDO MUNICIPIO

		// }-------------------------------------------------------------------------
		// Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(2));
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	

		// ATUALIZANDO CANDIDATO
		// }-------------------------------------------------------------------------
//		
//		Candidato candidato = new Candidato();
//		Municipio municipio = new Municipio();
//		municipio.setId(1L);
//		candidato.setNome("fulano");
//		candidato.setnNumero("25606");
//		candidato.setTipo("Vereador");
//		candidato.setMunicipio(municipio);
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato salvo");

		// ATUALIZANDO ZONA

		// }-------------------------------------------------------------------------

//		
//     	Zona zona = new Zona();
//		zona.setId(new Long(3));
////		zona.setNome("334");
////		_zonaRepository.save(zona);

		// ATUALIZANDO VOTO
		// }-----------------------------------------------------------------

//		Voto voto = new Voto();
//		zona.setId(new Long(3));
//		Candidato candidato = new Candidato();
//		candidato.setId(1l);
//		voto.setCandidato(candidato);
//        Zona zona = new Zona();
//		zona.setId(1l);
//		voto.setZona(zona);
//        Eleitor eleitor = new Eleitor();
//		eleitor.setId(1L);
//		voto.setEleitor(eleitor);

		// ELEITOR ATUALIZADO
		// }-------------------------------------------------------

//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long(1));
//		eleitor.setNome("Silvio doido");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor atualizado !");

		// }----------------------------------------------

		// SELECIONA APENAS UM MUNICIPIO

		// }----------------------------------------------

//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(2));
//		System.out.println("Município: " + municipio.get().getNome());

		// SELECIONA TODOS OS MUNICIPIOS

		// }----------------------------------------------

//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) {
//			System.out.println("Município: " + m.getNome());

		// }----------------------------------------------

		// SELECIONANDO APENAS UM CANDIDATO

		// }----------------------------------------------

//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(2));
//		System.out.println("Candidato: " + candidato.get().getNumero());
//		System.out.println("Nome: " + candidato.get().getNome());
//		System.out.println("Tipo: " + candidato.get().getTipo());

		// SELECIONA TODOS CANDIDATOS

		// }----------------------------------------------

//		Iterable<Candidato> candidato = _candidatoRepository.findAll();		
//		for(Candidato c : candidato) {
//			System.out.println("Candidato nº: " + c.getNumero());	
//			System.out.println("Candidato nome: " + c.getNome());
//			System.out.println("Colocação: " + c.getTipo());
		// }
		// }
		// }----------------------------------------------

		// SELECIONA APENAS UM ELEITOR

		// }----------------------------------------------

//		Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(1));
//		System.out.println("Nome do Eleitor: " + eleitor.get().getNome());

		// }----------------------------------------------

		// SELECIONA TODOS ELEITOR
		// }----------------------------------------------

//		Iterable<Eleitor> eleitor = _eleitorRepository.findAll();		
//		for(Eleitor e : eleitor) {
//			System.out.println("Eleitor nome: " + e.getNome());

		// }

		// }----------------------------------------------

		// SELECIONA APENAS UM VOTO

		// }----------------------------------------------
//		Optional<Voto> voto = _votoRepository.findById(new Long(2));
//		System.out.println("Voto: " + voto.get().getId());

		// }----------------------------------------------
		// SELECIONA TODOS OS VOTOS

//		Iterable<Voto> voto = _votoRepository.findAll();		
//		for(Voto v : voto) {
//			System.out.println("Voto n: " + v.getId());
//		}

		// }----------------------------------------------

		// SELECIONA A ZONA

		// }----------------------------------------------

//		Optional<Zona> zona = _zonaRepository.findById(new Long(2));
//		System.out.println("Zona: " + zona.get().getNumero());

		// }----------------------------------------------

		// SELECIONA A ZONA DE TODOS

		// }----------------------------------------------

//		Iterable<Zona> zona = _zonaRepository.findAll();		
//		for(Zona z : zona) {
//		System.out.println("Zona Eleitoral n: " + z.getNumero());
//		
//}
		// }----------------------------------------------

	}
}