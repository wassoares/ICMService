package org.soarescontabil.model;

import org.soarescontabil.model.aliquot.AliquotaExterior;
import org.soarescontabil.model.aliquot.Aliquota17Padrao12;
import org.soarescontabil.model.aliquot.Aliquota17Padrao7;
import org.soarescontabil.model.aliquot.Aliquota18Padrao12;
import org.soarescontabil.model.aliquot.Aliquota18Padrao7;
import org.soarescontabil.model.aliquot.Aliquota19Padrao7;

public enum Uf {
	
	AC {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	AL {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	AM {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},
	
	AP {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},
	
	BA {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},
	
	CE {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	DF {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},
	
	ES {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	EX {
		@Override
		public Aliquota obterAliquota() {
			return new AliquotaExterior();
		}
	},
	
	GO {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	MA {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},
	
	MG {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}
	},
	
	MT {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	MS {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	PA {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	PB {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},
		
	PE {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},
	
	PI {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},

	PR {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}
	},

	RJ {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota19Padrao7();
		}
	},
	
	RN {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},	
		
	RO {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},
	
	RR {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao12();
		}
	},

	RS {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}
	},

	SC {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota17Padrao7();
		}
	},
	
	SE {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	},

	SP {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao7();
		}
	},
	
	TO {
		@Override
		public Aliquota obterAliquota() {
			return new Aliquota18Padrao12();
		}
	};

	public abstract Aliquota obterAliquota();

}
