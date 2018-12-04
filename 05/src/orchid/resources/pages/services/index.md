---
menu:
  - type: pages
    group: 'services'
---

{% for page in findAll(collectionType='pages', collectionId='services') %}
- [{{page.title}}]({{page.link}})
{% endfor %}
