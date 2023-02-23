-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23-Fev-2023 às 17:46
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clinica`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agendamento`
--

CREATE TABLE `agendamento` (
  `cpf` varchar(120) NOT NULL,
  `data_agendamento` varchar(15) NOT NULL,
  `status` varchar(120) NOT NULL,
  `observacao` varchar(1500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `agendamento`
--

INSERT INTO `agendamento` (`cpf`, `data_agendamento`, `status`, `observacao`) VALUES
('80059845961', '29/05/1998', 'agendado', 'paciente com grippe'),
('80059845961', '45465', '5767', 'rtyryr');

-- --------------------------------------------------------

--
-- Estrutura da tabela `medico`
--

CREATE TABLE `medico` (
  `id` varchar(15) NOT NULL,
  `senha` varchar(120) NOT NULL,
  `email` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `medico`
--

INSERT INTO `medico` (`id`, `senha`, `email`) VALUES
('12345', 'chapeco2022', '0'),
('1500', 'babas', 'kukikoloi.com'),
('2022', 'Chape2022', 'lubinsebastienlionel@gmail.com'),
('254', 'dsfsgf', 'ehfjfj'),
('25478', 'sophard', 'luubins@gmail.com'),
('445656', 'bbbaba', 'jjsfjsjigljd'),
('gjgdfj', 'fdjhfgdj', 'fdjdfj');

-- --------------------------------------------------------

--
-- Estrutura da tabela `paciente`
--

CREATE TABLE `paciente` (
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(120) NOT NULL,
  `sobrenome` varchar(120) NOT NULL,
  `endereco` varchar(120) NOT NULL,
  `data_de_nasc` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `paciente`
--

INSERT INTO `paciente` (`cpf`, `nome`, `sobrenome`, `endereco`, `data_de_nasc`) VALUES
('65478598714', 'verddd', 'bastidor', 'egyeytryuru', '365444'),
('65478975541', 'leme', 'jacquet ', 'rua chritophe', '25/04/69'),
('80059845961', 'babas', 'lubin', '29051998', 'nada'),
('85478965489', 'fanm jaquet a', 'yes', 'ddd', 'fff'),
('98745695202', 'jessica', 'geneus', 'rua paiva', '26/05/1998'),
('98745896321', 'Angemy ', 'Saint Bert', 'rua inambu 21', '26/05/1998');

-- --------------------------------------------------------

--
-- Estrutura da tabela `paciente2`
--

CREATE TABLE `paciente2` (
  `cpf` varchar(655) NOT NULL,
  `nome` varchar(555) NOT NULL,
  `sobrenome` varchar(555) NOT NULL,
  `endereco` varchar(555) NOT NULL,
  `data_de_nasc` varchar(545) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `paciente2`
--

INSERT INTO `paciente2` (`cpf`, `nome`, `sobrenome`, `endereco`, `data_de_nasc`) VALUES
('80059845961', '[value-2]', '[value-3]', '[value-4]', '[value-5]');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `agendamento`
--
ALTER TABLE `agendamento`
  ADD KEY `cpf` (`cpf`);

--
-- Índices para tabela `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`cpf`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `agendamento`
--
ALTER TABLE `agendamento`
  ADD CONSTRAINT `agendamento_ibfk_1` FOREIGN KEY (`cpf`) REFERENCES `paciente` (`cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
