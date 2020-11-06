package org.soarescontabil.icmservice.model;

import org.soarescontabil.icmservice.model.aliquot.Aliquota17Padrao12;
import org.soarescontabil.icmservice.model.aliquot.Aliquota17Padrao7;
import org.soarescontabil.icmservice.model.aliquot.Aliquota18Padrao12;
import org.soarescontabil.icmservice.model.aliquot.Aliquota18Padrao7;
import org.soarescontabil.icmservice.model.aliquot.Aliquota19Padrao7;
import org.soarescontabil.icmservice.model.aliquot.AliquotaExterior;

public enum Uf {

	AC {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosAC();
		}
	},

	AL {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosAL();
		}
	},

	AM {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosAM();
		}
	},

	AP {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosAP();
		}
	},

	BA {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosBA();
		}
	},

	CE {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosCE();
		}
	},

	DF {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosDF();
		}
	},

	ES {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosES();
		}
	},

	IM {
		@Override
		public Aliquota obterAliquota() {
			return new AliquotaImportacao();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosIM();
		}
	},

	GO {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosGO();
		}
	},

	MA {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosMA();
		}
	},

	MG {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosMG();
		}
	},

	MT {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosMT();
		}
	},

	MS {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosMS();
		}
	},

	PA {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosPA();
		}
	},

	PB {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosPB();
		}
	},

	PE {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosPE();
		}
	},

	PI {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosPI();
		}
	},

	PR {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosPR();
		}
	},

	RJ {
		@Override
		public Aliquota obterAliquota() {
			return new AliquotaRioDeJaneiro();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosRJ();
		}
	},

	RN {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosRN();
		}
	},

	RO {
		@Override
		public Aliquota obterAliquota() {
			return new AliquotaRondonia();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosRO();
		}
	},

	RR {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosRR();
		}
	},

	RS {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosRS();
		}
	},

	SC {
		@Override
		public Aliquota obterAliquota() {
			return new AliquotaSantaCatarina();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosSC();
		}
	},

	SE {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosSE();
		}
	},

	SP {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosSP();
		}
	},

	TO {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}

		@Override
		public Funcep[] obterFuncep() {
			return FuncepEstados.carregarDadosTO();
		}
	};

	public abstract Aliquota obterAliquota();

	public abstract Funcep[] obterFuncep();

}
