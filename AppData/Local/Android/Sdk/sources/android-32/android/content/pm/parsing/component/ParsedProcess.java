/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.content.pm.parsing.component;

import static java.util.Collections.emptySet;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArraySet;

import com.android.internal.util.CollectionUtils;
import com.android.internal.util.DataClass;
import com.android.internal.util.Parcelling;

import java.util.Set;

/** @hide */
@DataClass(genGetters = true, genSetters = false, genParcelable = true, genAidl = false,
        genBuilder = false)
public class ParsedProcess implements Parcelable {

    @NonNull
    protected String name;
    @NonNull
    @DataClass.ParcelWith(Parcelling.BuiltIn.ForInternedStringSet.class)
    protected Set<String> deniedPermissions = emptySet();

    @ApplicationInfo.GwpAsanMode
    protected int gwpAsanMode = ApplicationInfo.GWP_ASAN_DEFAULT;
    @ApplicationInfo.MemtagMode
    protected int memtagMode = ApplicationInfo.MEMTAG_DEFAULT;
    @ApplicationInfo.NativeHeapZeroInitialized
    protected int nativeHeapZeroInitialized = ApplicationInfo.ZEROINIT_DEFAULT;

    public ParsedProcess() {
    }

    public ParsedProcess(@NonNull ParsedProcess other) {
        name = other.name;
        deniedPermissions = new ArraySet<>(other.deniedPermissions);
    }

    public void addStateFrom(@NonNull ParsedProcess other) {
        deniedPermissions = CollectionUtils.addAll(deniedPermissions, other.deniedPermissions);
    }



    // Code below generated by codegen v1.0.22.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/android/content/pm/parsing/component/ParsedProcess.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    public ParsedProcess(
            @NonNull String name,
            @NonNull Set<String> deniedPermissions,
            @ApplicationInfo.GwpAsanMode int gwpAsanMode,
            @ApplicationInfo.MemtagMode int memtagMode,
            @ApplicationInfo.NativeHeapZeroInitialized int nativeHeapZeroInitialized) {
        this.name = name;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, name);
        this.deniedPermissions = deniedPermissions;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, deniedPermissions);
        this.gwpAsanMode = gwpAsanMode;
        com.android.internal.util.AnnotationValidations.validate(
                ApplicationInfo.GwpAsanMode.class, null, gwpAsanMode);
        this.memtagMode = memtagMode;
        com.android.internal.util.AnnotationValidations.validate(
                ApplicationInfo.MemtagMode.class, null, memtagMode);
        this.nativeHeapZeroInitialized = nativeHeapZeroInitialized;
        com.android.internal.util.AnnotationValidations.validate(
                ApplicationInfo.NativeHeapZeroInitialized.class, null, nativeHeapZeroInitialized);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public @NonNull String getName() {
        return name;
    }

    @DataClass.Generated.Member
    public @NonNull Set<String> getDeniedPermissions() {
        return deniedPermissions;
    }

    @DataClass.Generated.Member
    public @ApplicationInfo.GwpAsanMode int getGwpAsanMode() {
        return gwpAsanMode;
    }

    @DataClass.Generated.Member
    public @ApplicationInfo.MemtagMode int getMemtagMode() {
        return memtagMode;
    }

    @DataClass.Generated.Member
    public @ApplicationInfo.NativeHeapZeroInitialized int getNativeHeapZeroInitialized() {
        return nativeHeapZeroInitialized;
    }

    @DataClass.Generated.Member
    static Parcelling<Set<String>> sParcellingForDeniedPermissions =
            Parcelling.Cache.get(
                    Parcelling.BuiltIn.ForInternedStringSet.class);
    static {
        if (sParcellingForDeniedPermissions == null) {
            sParcellingForDeniedPermissions = Parcelling.Cache.put(
                    new Parcelling.BuiltIn.ForInternedStringSet());
        }
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeString(name);
        sParcellingForDeniedPermissions.parcel(deniedPermissions, dest, flags);
        dest.writeInt(gwpAsanMode);
        dest.writeInt(memtagMode);
        dest.writeInt(nativeHeapZeroInitialized);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    protected ParsedProcess(@NonNull Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        String _name = in.readString();
        Set<String> _deniedPermissions = sParcellingForDeniedPermissions.unparcel(in);
        int _gwpAsanMode = in.readInt();
        int _memtagMode = in.readInt();
        int _nativeHeapZeroInitialized = in.readInt();

        this.name = _name;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, name);
        this.deniedPermissions = _deniedPermissions;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, deniedPermissions);
        this.gwpAsanMode = _gwpAsanMode;
        com.android.internal.util.AnnotationValidations.validate(
                ApplicationInfo.GwpAsanMode.class, null, gwpAsanMode);
        this.memtagMode = _memtagMode;
        com.android.internal.util.AnnotationValidations.validate(
                ApplicationInfo.MemtagMode.class, null, memtagMode);
        this.nativeHeapZeroInitialized = _nativeHeapZeroInitialized;
        com.android.internal.util.AnnotationValidations.validate(
                ApplicationInfo.NativeHeapZeroInitialized.class, null, nativeHeapZeroInitialized);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<ParsedProcess> CREATOR
            = new Parcelable.Creator<ParsedProcess>() {
        @Override
        public ParsedProcess[] newArray(int size) {
            return new ParsedProcess[size];
        }

        @Override
        public ParsedProcess createFromParcel(@NonNull Parcel in) {
            return new ParsedProcess(in);
        }
    };

    @DataClass.Generated(
            time = 1615850515058L,
            codegenVersion = "1.0.22",
            sourceFile = "frameworks/base/core/java/android/content/pm/parsing/component/ParsedProcess.java",
            inputSignatures = "protected @android.annotation.NonNull java.lang.String name\nprotected @android.annotation.NonNull @com.android.internal.util.DataClass.ParcelWith(com.android.internal.util.Parcelling.BuiltIn.ForInternedStringSet.class) java.util.Set<java.lang.String> deniedPermissions\nprotected @android.content.pm.ApplicationInfo.GwpAsanMode int gwpAsanMode\nprotected @android.content.pm.ApplicationInfo.MemtagMode int memtagMode\nprotected @android.content.pm.ApplicationInfo.NativeHeapZeroInitialized int nativeHeapZeroInitialized\npublic  void addStateFrom(android.content.pm.parsing.component.ParsedProcess)\nclass ParsedProcess extends java.lang.Object implements [android.os.Parcelable]\n@com.android.internal.util.DataClass(genGetters=true, genSetters=false, genParcelable=true, genAidl=false, genBuilder=false)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
