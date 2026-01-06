Day40 — Set Collection Overview (HashSet / LinkedHashSet / TreeSet)
学习 Set 接口的整体特性：元素不重复、无索引，通过内容而非位置组织数据
对比三种常见 Set 实现的行为差异
HashSet：不保证元素存取顺序，基于哈希结构去重
LinkedHashSet：在去重基础上维护插入顺序，行为可预测
TreeSet：基于排序规则存储元素，默认使用自然顺序（升序）
理解 TreeSet 的排序结果来源于元素本身的可比较性，而非插入顺序
为后续 Map / Sorted 数据结构做铺垫
