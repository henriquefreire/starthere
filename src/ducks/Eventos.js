import { createActions, createReducer } from "reduxsauce";

export const { Types, Creators } = createActions({
  buscarTodosEventos: ["payload"],
  buscarTodosEventosSucesso: ["payload"],
  addEvento: ["payload"],
  addEventoSucesso: ["payload"],
  setEventoMensagem: ["payload"]
});
const INIT_STATE = {
  listaEventos: []
};
const buscarEventos = (state = INIT_STATE, action) => {
	return {
	  ...state,
	  listaEventos: action.payload.eventos
	};
  };
const addEventos = (state = INIT_STATE, action) => {
  return {
    ...state
  };
};

export default createReducer(INIT_STATE, {
  [Types.BUSCAR_TODOS_EVENTOS_SUCESSO]: buscarEventos
});