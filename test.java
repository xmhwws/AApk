package com.nonono1.nononono1.derivedproperty.impl;

import com.nonono1.annotation.NotApi;
import com.nonono1.nononono1.core.Project;
import com.nonono1.nononono1.derivedproperty.impl.DirectedExpression;
import com.nonono1.nononono1.derivedproperty.impl.FeatureInfo;
import com.nonono1.nononono1.dynamicrepository.DynamicRepositoryHelper;
import com.nonono1.nononono1.expressions.ElementExpression;
import com.nonono1.nononono1.expressions.specification.Direction;
import com.nonono1.nononono1.expressions.ui.k;
import com.nonono1.nononono1.uml.StereotypedElementWrapper;
import com.nonono1.nononono1.uml2.Classifiers;
import com.nonono1.nononono1.valuesetters.ValueSetterContext;
import com.nonono1.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nonono1.uml2.ext.jmi.reflect.ModelReflection;
import com.nonono1.uml2.ext.jmi.reflect.ValueSetter;
import com.nonono1.uml2.ext.nononono1.classes.mdkernel.Class;
import com.nonono1.uml2.ext.nononono1.classes.mdkernel.Element;
import com.nonono1.uml2.ext.nononono1.mdprofiles.Stereotype;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.CheckForNull;
import org.omg.mof.model.Reference;
import org.omg.mof.model.StructuralFeature;

@NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
@Deprecated
/* loaded from: C:\Users\admin\AppData\Local\Temp\jadx-16921734271203537180\classes.dex */
public class e extends com.nonono1.nononono1.derivedproperty.impl.d {
    private final Project e;
    private final String f;
    private final String g;
    private final boolean h;
    private final Predicate<Element> i;
    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected FeatureInfo.FeatureEditRule j;
    private final ModelReflection k;
    private final HashMap<Class, FeatureInfo> l;

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public e(Project project, DirectedExpression.Type type, Direction direction, String str, @CheckForNull String str2, boolean z, @CheckForNull Class r7, FeatureInfo featureInfo, @CheckForNull TargetType[] targetTypeArr) {
        super(type, direction, targetTypeArr);
        this.j = new d();
        this.l = new HashMap<>();
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = r7 instanceof Stereotype ? new b((Stereotype) r7) : new f(r7);
        this.b = featureInfo;
        this.e = project;
        this.k = DynamicRepositoryHelper.getModelReflection(project);
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public boolean setValue(Element element, Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            try {
                if (canSetValue(element, obj, valueSetterContext)) {
                    switch (a.a[this.d.ordinal()]) {
                        case 1:
                            return a(element, obj, valueSetterContext);
                        case 2:
                            return c(element, obj, valueSetterContext);
                        case 3:
                            return b(element, obj, valueSetterContext);
                        default:
                            return false;
                    }
                }
                return false;
            } catch (RuntimeException e) {
                throw a(e);
            }
        } catch (RuntimeException e2) {
            throw a(e2);
        }
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    /* loaded from: C:\Users\admin\AppData\Local\Temp\jadx-16921734271203537180\classes.dex */
    static /* synthetic */ class a {
        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Direction.values().length];
            a = iArr;
            try {
                iArr[Direction.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[Direction.OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[Direction.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public boolean isAtomic() {
        return true;
    }

    private boolean a(Element element, Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        FeatureInfo featureInfo = getFeatureInfo();
        try {
            if (featureInfo != null) {
                try {
                    if (featureInfo.getUpper() == 1 && (obj instanceof Collection)) {
                        Collection collection = (Collection) obj;
                        try {
                            obj = collection.isEmpty() ? null : collection.iterator().next();
                        } catch (RuntimeException e) {
                            throw a(e);
                        }
                    }
                } catch (RuntimeException e2) {
                    throw a(e2);
                }
            }
            element.refSetValue(this.f, obj, valueSetterContext);
            return true;
        } catch (RuntimeException e3) {
            throw a(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (a(r2, r3, r4) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(Element element, Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            try {
                try {
                    if (a(element)) {
                    }
                    return b(element) && c(element, obj, valueSetterContext);
                } catch (RuntimeException e) {
                    throw a(e);
                }
            } catch (RuntimeException e2) {
                try {
                    throw a(e2);
                } catch (RuntimeException e3) {
                    throw a(e3);
                }
            }
        } catch (RuntimeException e4) {
            throw a(e4);
        }
    }

    private boolean c(Element element, Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            if (s()) {
                element.refSetValue(this.g, obj, valueSetterContext);
                return true;
            } else if (obj instanceof Element) {
                ((Element) obj).refSetValue(this.f, element, valueSetterContext);
                return true;
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    try {
                        if ((obj2 instanceof Element) && obj2 != element) {
                            ((Element) obj2).refSetValue(this.f, element, valueSetterContext);
                        }
                    } catch (RuntimeException e) {
                        throw a(e);
                    }
                }
                return true;
            } else {
                throw new RuntimeException("Value is not RefObject. Impossible to set targetToSource for: " + this.f + ". Opposite name: " + this.g);
            }
        } catch (RuntimeException e2) {
            throw a(e2);
        }
    }

    @CheckForNull
    private static FeatureInfo a(Direction direction, String str, Project project, boolean z, @CheckForNull String str2, Class r6) {
        try {
            if (direction == Direction.OPPOSITE) {
                return a(z, str2, str, project, r6);
            }
            return ag.a(str, r6, project);
        } catch (RuntimeException e) {
            throw a(e);
        }
    }

    @CheckForNull
    private static FeatureInfo a(boolean z, @CheckForNull String str, String str2, Project project, Class r4) {
        if (!z && str != null) {
            try {
                return ag.a(str, r4, project);
            } catch (RuntimeException e) {
                throw a(e);
            }
        }
        return ag.a(str2, r4, project);
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public boolean canSetValue(Element element, @CheckForNull Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            switch (a.a[this.d.ordinal()]) {
                case 2:
                    return f(element, obj);
                case 3:
                    return a(element, obj);
                default:
                    return e(element, obj);
            }
        } catch (RuntimeException e) {
            throw a(e);
        }
    }

    @CheckForNull
    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected Class getMetaClass(Element element) {
        return StereotypesHelper.getBaseClass(element);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (e(r2, r3) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(Element element, @CheckForNull Object obj) {
        try {
            try {
                try {
                    if (a(element)) {
                    }
                    return b(element) && f(element, obj);
                } catch (RuntimeException e) {
                    throw a(e);
                }
            } catch (RuntimeException e2) {
                try {
                    throw a(e2);
                } catch (RuntimeException e3) {
                    throw a(e3);
                }
            }
        } catch (RuntimeException e4) {
            throw a(e4);
        }
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected final boolean a(Element element) {
        return c(element);
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected final boolean b(Element element) {
        try {
            return !c(element);
        } catch (RuntimeException e) {
            throw a(e);
        }
    }

    private boolean c(Element element) {
        return this.i.test(element);
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public void removeValue(Element element, Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            try {
                if (canRemoveValue(element, obj, valueSetterContext)) {
                    switch (a.a[this.d.ordinal()]) {
                        case 2:
                            e(element, obj, valueSetterContext);
                            return;
                        case 3:
                            d(element, obj, valueSetterContext);
                            return;
                        default:
                            a(element, obj, this.f, valueSetterContext);
                            return;
                    }
                }
            } catch (RuntimeException e) {
                throw a(e);
            }
        } catch (RuntimeException e2) {
            throw a(e2);
        }
    }

    private void d(Element element, Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            if (a(element)) {
                a(element, obj, this.f, valueSetterContext);
                return;
            }
            try {
                if (b(element)) {
                    e(element, obj, valueSetterContext);
                }
            } catch (RuntimeException e) {
                throw a(e);
            }
        } catch (RuntimeException e2) {
            throw a(e2);
        }
    }

    private static void a(Element element, Object obj, String str, @CheckForNull ValueSetterContext valueSetterContext) {
        boolean remove;
        Object refGetValue = element.refGetValue(str, valueSetterContext);
        if (refGetValue instanceof Collection) {
            ArrayList arrayList = new ArrayList((Collection) refGetValue);
            if (obj instanceof Collection) {
                remove = arrayList.removeAll((Collection) obj);
            } else {
                remove = arrayList.remove(obj);
            }
            if (remove) {
                try {
                    element.refSetValue(str, arrayList, valueSetterContext);
                } catch (RuntimeException e) {
                    throw a(e);
                }
            }
        } else if (refGetValue == obj) {
            try {
                element.refSetValue(str, (Object) null, valueSetterContext);
            } catch (RuntimeException e2) {
                throw a(e2);
            }
        } else {
            element.refSetValue(str, obj, valueSetterContext);
        }
    }

    private void e(Element element, Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            if (s()) {
                a(element, obj, this.g, valueSetterContext);
            } else if (obj instanceof Element) {
                a((Element) obj, element, this.f, valueSetterContext);
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    if (obj2 instanceof Element) {
                        a((Element) obj2, element, this.f, valueSetterContext);
                    }
                }
            }
        } catch (RuntimeException e) {
            throw a(e);
        }
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public boolean canRemoveValue(Element element, @CheckForNull Object obj, @CheckForNull ValueSetterContext valueSetterContext) {
        try {
            switch (a.a[this.d.ordinal()]) {
                case 2:
                    return c(element, obj);
                case 3:
                    return d(element, obj);
                default:
                    return b(element, obj);
            }
        } catch (RuntimeException e) {
            throw a(e);
        }
    }

    private boolean b(Element element, @CheckForNull Object obj) {
        try {
            return FeatureUtils.canRemoveFeatureValue(element, obj, c(element) ? getFeatureInfo() : a(this.d, element), this.d, this.j);
        } catch (RuntimeException e) {
            throw a(e);
        }
    }

    private boolean c(Element element, @CheckForNull Object obj) {
        return FeatureUtils.canRemoveFeatureValue(element, obj, a(this.d, element), this.d, this.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (b(r2, r3) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean d(Element element, @CheckForNull Object obj) {
        try {
            try {
                try {
                    if (a(element)) {
                    }
                    return b(element) && c(element, obj);
                } catch (RuntimeException e) {
                    throw a(e);
                }
            } catch (RuntimeException e2) {
                try {
                    throw a(e2);
                } catch (RuntimeException e3) {
                    throw a(e3);
                }
            }
        } catch (RuntimeException e4) {
            throw a(e4);
        }
    }

    private boolean e(Element element, @CheckForNull Object obj) {
        return a(element, obj, getFeatureInfo(), false);
    }

    private boolean f(Element element, @CheckForNull Object obj) {
        FeatureInfo a2 = a(this.d, element);
        try {
            if (s()) {
                return a(element, obj, a2, true);
            }
            return a(obj, obj2 -> {
                return a(r1, a2, element);
            });
        } catch (RuntimeException e) {
            throw a(e);
        }
    }

    private boolean a(Element element, @CheckForNull Object obj, @CheckForNull FeatureInfo featureInfo) {
        try {
            if (obj instanceof Element) {
                return b((Element) obj, element, featureInfo, false);
            }
            return false;
        } catch (RuntimeException e) {
            try {
                throw a(e);
            } catch (RuntimeException e2) {
                throw a(e2);
            }
        }
    }

    private boolean a(Element element, @CheckForNull Object obj, @CheckForNull FeatureInfo featureInfo, boolean z) {
        return a(obj, obj2 -> {
            return b(r1, z, element, featureInfo);
        });
    }

    private static boolean a(@CheckForNull Object obj, Predicate<Object> predicate) {
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                try {
                    if (!predicate.test(obj2)) {
                        return false;
                    }
                } catch (RuntimeException e) {
                    throw a(e);
                }
            }
            return true;
        }
        return predicate.test(obj);
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected boolean s() {
        try {
            if (!this.h) {
                if (this.g != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            try {
                throw a(e);
            } catch (RuntimeException e2) {
                throw a(e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (c(r0) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
        if (c(r4) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(Element element, @CheckForNull Object obj, @CheckForNull FeatureInfo featureInfo, boolean z) {
        try {
            Element element2 = obj instanceof Element ? (Element) obj : null;
            if (z) {
                if (element2 != null) {
                    try {
                    } catch (RuntimeException e) {
                        try {
                            throw a(e);
                        } catch (RuntimeException e2) {
                            throw a(e2);
                        }
                    }
                }
                if (FeatureUtils.canSetSingleValue(element, obj, featureInfo, this.a, this.j)) {
                    if (element2 != null) {
                        try {
                            if (ModelReflection.canBeValueForFeature(element, z ? this.g : this.f, element2)) {
                            }
                        } catch (RuntimeException e3) {
                            throw a(e3);
                        }
                    }
                    return true;
                }
                return false;
            }
            try {
                try {
                } catch (RuntimeException e4) {
                    throw a(e4);
                }
            } catch (RuntimeException e5) {
                throw a(e5);
            }
            try {
                throw a(e4);
            } catch (RuntimeException e6) {
                try {
                    throw a(e6);
                } catch (RuntimeException e7) {
                    throw a(e7);
                }
            }
        } catch (RuntimeException e8) {
            throw a(e8);
        }
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected StructuralFeature getStructuralFeature(Element element, String str) {
        return this.k.getFeature(str, element, false);
    }

    @CheckForNull
    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected FeatureInfo a(Direction direction, Element element) {
        String str = this.f;
        try {
            try {
                if (direction.equals(Direction.DIRECT)) {
                    if (c(element)) {
                        return getFeatureInfo();
                    }
                } else if (s()) {
                    str = this.g;
                }
                Class metaClass = getMetaClass(element);
                if (metaClass != null) {
                    try {
                        return a(str, metaClass, this.e);
                    } catch (RuntimeException e) {
                        throw a(e);
                    }
                }
                return getFeatureInfo();
            } catch (RuntimeException e2) {
                throw a(e2);
            }
        } catch (RuntimeException e3) {
            throw a(e3);
        }
    }

    @CheckForNull
    private FeatureInfo a(String str, Class r3, Project project) {
        FeatureInfo featureInfo = this.l.get(r3);
        if (featureInfo == null) {
            FeatureInfo createFeatureInfo = createFeatureInfo(str, r3, project);
            if (createFeatureInfo == null) {
                try {
                    createFeatureInfo = FeatureInfo.NULL_FEATURE;
                } catch (RuntimeException e) {
                    throw a(e);
                }
            }
            featureInfo = createFeatureInfo;
            this.l.put(r3, featureInfo);
        }
        try {
            if (FeatureInfo.NULL_FEATURE.equals(featureInfo)) {
                return null;
            }
            return featureInfo;
        } catch (RuntimeException e2) {
            throw a(e2);
        }
    }

    @CheckForNull
    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    protected FeatureInfo createFeatureInfo(String str, Class r2, Project project) {
        return ag.a(str, r2, project);
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public Project t() {
        return this.e;
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public String u() {
        return this.f;
    }

    @CheckForNull
    private static ValueSetter a(Class r14, DirectedExpression.Type type, Direction direction, @CheckForNull TargetType[] targetTypeArr, String str, Project project, Class r20) {
        Reference a2;
        Reference reference;
        FeatureInfo a3;
        boolean z;
        String str2;
        if (r14 == null) {
            return null;
        }
        try {
            if (r14 instanceof Stereotype) {
                Function function = modelReflection -> {
                    return new StereotypedElementWrapper((Stereotype) r14).createInstance(project);
                };
                Objects.requireNonNull(r14);
                a2 = k.a(project, str, function, this::getQualifiedName);
            } else {
                a2 = k.a(r14, str);
            }
            if (!(a2 instanceof Reference)) {
                reference = null;
            } else {
                reference = ar.a(a2);
            }
            if (reference == null) {
                try {
                    if (Direction.OPPOSITE.equals(direction)) {
                        return null;
                    }
                    a3 = a(direction, str, project, true, null, r14);
                    z = true;
                    str2 = null;
                } catch (RuntimeException e) {
                    try {
                        throw a(e);
                    } catch (RuntimeException e2) {
                        throw a(e2);
                    }
                }
            } else {
                boolean a4 = ar.a(project, reference);
                String name = reference.getName();
                FeatureInfo a5 = ag.a(a2.getName(), r14, project);
                if (a5 == null) {
                    try {
                        if (r14 instanceof Stereotype) {
                            a3 = ag.a(a2, project, false, false, false);
                            str2 = name;
                            z = a4;
                        }
                    } catch (RuntimeException e3) {
                        throw a(e3);
                    }
                }
                str2 = name;
                z = a4;
                a3 = a5;
            }
            if (a3 == null) {
                return null;
            }
            try {
                try {
                    if ("appliedStereotype".equals(str)) {
                        return new l(direction, a3);
                    }
                    try {
                        try {
                            if (!a3.isComposite()) {
                                if (!a3.isSubsetOfOwner() && !a3.isSubsetOfOwnedElement()) {
                                    return new e(project, type, direction, str, str2, z, r20, a3, targetTypeArr);
                                }
                            }
                            return com.nonono1.nononono1.derivedproperty.impl.f.a(type, direction, targetTypeArr, str, project, r20, a3, str2, z);
                        } catch (RuntimeException e4) {
                            throw a(e4);
                        }
                    } catch (RuntimeException e5) {
                        throw a(e5);
                    }
                } catch (RuntimeException e6) {
                    throw a(e6);
                }
            } catch (RuntimeException e7) {
                throw a(e7);
            }
        } catch (RuntimeException e8) {
            throw a(e8);
        }
    }

    @CheckForNull
    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    public static ValueSetter a(ElementExpression elementExpression) {
        if (elementExpression instanceof bo) {
            bo boVar = (bo) elementExpression;
            return a(boVar.t(), boVar.getType(), boVar.getDirection(), boVar.getTargetTypes(), boVar.s(), boVar.getProject(), boVar.t());
        }
        return null;
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    /* loaded from: C:\Users\admin\AppData\Local\Temp\jadx-16921734271203537180\classes.dex */
    private static class d extends c {
        private d() {
        }

        @Override // com.nonono1.nononono1.derivedproperty.impl.e.c
        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        public boolean isEditable(@CheckForNull FeatureInfo featureInfo) {
            return (featureInfo == null || featureInfo.isSubsetOfOwner() || !super.isEditable(featureInfo) || featureInfo.isComposite()) ? false : true;
        }
    }

    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    @Deprecated
    /* loaded from: C:\Users\admin\AppData\Local\Temp\jadx-16921734271203537180\classes.dex */
    protected static class c implements FeatureInfo.FeatureEditRule {
        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        protected c() {
        }

        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        public boolean isEditable(@CheckForNull FeatureInfo featureInfo) {
            return (featureInfo == null || !featureInfo.isChangeable() || featureInfo.isSubsetOfDirectedRelationship()) ? false : true;
        }
    }

    @Deprecated
    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    /* loaded from: C:\Users\admin\AppData\Local\Temp\jadx-16921734271203537180\classes.dex */
    private static final class b implements Predicate<Element> {
        private final Stereotype a;

        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        b(Stereotype stereotype) {
            this.a = stereotype;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // java.util.function.Predicate
        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        /* renamed from: a */
        public boolean test(Element element) {
            return StereotypesHelper.hasStereotypeOrDerived(element, this.a);
        }
    }

    @Deprecated
    @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
    /* loaded from: C:\Users\admin\AppData\Local\Temp\jadx-16921734271203537180\classes.dex */
    private final class f implements Predicate<Element> {
        private final Class a;

        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        f(@CheckForNull Class r2) {
            this.a = r2;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // java.util.function.Predicate
        @NotApi(reason = "No Nono1 internal source code. This code can be obfuscated and changed on each build.")
        @Deprecated
        /* renamed from: a */
        public boolean test(Element element) {
            return Classifiers.isSameOrDerivedClassifier(this.a, e.this.getMetaClass(element));
        }
    }
}