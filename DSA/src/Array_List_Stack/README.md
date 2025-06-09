# Estruturas de Dados Fundamentais em Java: Arrays, Lists e Stacks

## 1. Arrays (Vetores)

### Conceito Básico:
Arrays são estruturas de tamanho fixo que armazenam elementos do mesmo tipo em posições contíguas de memória.

### Implementação:
```java
String[] sannin = new String[3];
sannin[0] = "Jyraya";
sannin[1] = "Orochimaru"; 
sannin[2] = "Tsunade";
```

### Características Avançadas:
- **Alocação estática**: Memória alocada no momento da criação
- **Acesso direto**: O(1) para qualquer elemento via índice
- **Tipos primitivos**: Pode armazenar `int`, `double`, etc. ou objetos
- **Multidimensionais**: `int[][] matrix = new int[3][3]`

### Métodos Úteis (via `java.util.Arrays`):
```java
Arrays.sort(sannin); // Ordenação
Arrays.fill(sannin, "Naruto"); // Preenchimento
int length = sannin.length; // Tamanho (não é método!)
```

### Vantagens:
- Extremamente eficiente em memória e velocidade
- Ideal para quantidades fixas de elementos

### Desvantagens:
- Tamanho imutável após criação
- Operações de inserção/remoção custosas (O(n))
---
## 2. Lists (Listas - ArrayList)

### Conceito Básico
Implementação de lista usando array dinâmico que redimensiona automaticamente.

### Implementação:
```java
List<String> jounin = new ArrayList<>();
jounin.add("Kakashi");
jounin.add("Gai");
```

### Características Avançadas:
- **Fator de crescimento**: Normalmente 50% do tamanho atual
- **Capacidade inicial**: Pode ser especificada no construtor
- **Iteradores**: `ListIterator` permite navegação bidirecional

### Principais Métodos:
```java
jounin.get(1); // Acesso por índice
jounin.set(1, "Might Guy"); // Substituição
jounin.remove(0); // Remoção
jounin.contains("Gai"); // Busca
```

### Complexidade Computacional:
| Operação | Complexidade |
|----------|--------------|
| add() | O(1) amortizado |
| get() | O(1) |
| remove() | O(n) |
| contains() | O(n) |

### Variações Importantes:
- **LinkedList**: Melhor para inserções/remoções frequentes
- **Vector**: Versão sincronizada (thread-safe)
---
## 3. Stack (Pilha)

### Conceito Básico:
Estrutura LIFO (Last-In-First-Out) que extende Vector.

### Implementação:
```java
Stack<String> genin = new Stack<>();
genin.push("Neji");
genin.peek(); // Ver topo
genin.pop(); // Remover
```

### Características Avançadas:
- **Herança**: Estende classe Vector (usa array internamente)
- **Sincronização**: Métodos são thread-safe
- **Alternativas modernas**: `Deque` interface (mais performática)

### Métodos Essenciais:
```java
empty(); // Testa se vazia
search("Gaara"); // Retorna posição (1-based)
```

### Aplicações Práticas:
1. **Algoritmos**: DFS, avaliação de expressões
2. **Sistemas**: Undo/Redo, histórico de navegação
3. **Jogos**: Sistemas de combate por turnos

## Comparação Detalhada:

| Critério | Array | ArrayList | Stack |
|---------|-------|-----------|-------|
| **Tamanho** | Fixo | Dinâmico | Dinâmico |
| **Thread-safe** | Não | Não | Sim |
| **Acesso** | Random | Random | Somente topo |
| **Inserção** | O(n) | O(1) amortizado | O(1) |
| **Busca** | O(n) | O(n) | O(n) |
| **Uso Memória** | Mínimo | Moderado | Moderado |

## Boas Práticas:

1. **Arrays**:
    - Use para dados estáticos e performance crítica
    - Prefira `System.arraycopy()` para cópias

2. **ArrayList**:
    - Defina capacidade inicial se tamanho for conhecido
    - Use `ensureCapacity()` antes de adições em massa

3. **Stack**:
    - Considere `ArrayDeque` para melhor performance
    - Evite usar como lista geral (não é seu propósito)

## Exemplo Avançado Integrado:

```java
// Demonstração de várias operações
public class DataStructuresDemo {
    public static void main(String[] args) {
        // Array avançado
        int[] numbers = {3, 1, 4, 1, 5, 9};
        Arrays.parallelSort(numbers);
        
        // ArrayList avançado
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,1,4,1,5,9));
        nums.removeIf(n -> n < 3); // Remoção condicional
        
        // Stack com capacidade
        Stack<Integer> stack = new Stack<>();
        stack.ensureCapacity(20);
        IntStream.range(0, 10).forEach(stack::push);
    }
}
```

## Conclusão:

Cada estrutura tem seu propósito ideal:
- **Arrays** para performance e tamanho fixo
- **ArrayList** para uso geral dinâmico
- **Stack** para comportamentos LIFO específicos

A escolha depende dos requisitos de:
- Performance
- Flexibilidade
- Casos de uso específicos