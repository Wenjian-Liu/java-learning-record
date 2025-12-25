# Day28 - 2025/12/25

## Focus
- Consolidated `Object.equals` semantics and implementation workflow.

## What I reinforced
- Default `equals` (reference equality) vs overridden `equals` (value/semantic equality)
- Typical workflow: identity check -> null check -> type check -> cast -> field comparison
- Common pitfalls: using `==` for reference fields, missing cast, mixing constructor params with object state

## Output
- Consolidation notes + self-generation practice (no new feature code).
