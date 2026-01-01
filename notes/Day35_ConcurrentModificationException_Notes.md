Topic: ConcurrentModificationException（并发修改异常）+ 遍历方式差异梳理

What I learned

理解 ConcurrentModificationException 的触发条件：遍历过程中结构性修改集合（add/remove）

区分三类遍历的适用场景与限制：Iterator / enhanced for / forEach(Lambda)

掌握正确删除姿势：使用 Iterator.remove()，避免在遍历中直接 collection.remove()

Notes / Pitfalls

“修改”分两类：结构性修改（size 变化）vs 元素内容修改（不触发）

增强 for 本质依赖 Iterator；Lambda forEach 同样会受 fail-fast 机制影响

Output

Demo：复现异常 + 正确删除示例（Iterator remove）
