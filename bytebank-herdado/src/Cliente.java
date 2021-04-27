public class Cliente implements Autenticavel {

        private AutenticaoUtil autenticador;

        public Cliente() {
            this.autenticador = new AutenticaoUtil();
        }

        @Override
        public void setSenha(int senha) {
            this.autenticador.setSenha(senha);
        }

        @Override
        public boolean autentica(int senha) {
            return this.autenticador.autentica(senha);
        }
}