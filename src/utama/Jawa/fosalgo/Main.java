package fosalgo;

import java.util.Scanner;

/**
 *
 * @author Sugiarto Cokrowibowo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //TULISKAN KODEMU DIBAWAH INI
        
        <?xml version="1.0"?>
<flowgorithm fileversion="2.11">
    <attributes>
        <attribute name="name" value=""/>
        <attribute name="authors" value="VD1"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2021-03-01 06:33:35 AM"/>
        <attribute name="created" value="VkQxO0RFU0tUT1AtSzE0UVJDMjsyMDIxLTAzLTAxOzA2OjMwOjM0IEFNOzI0OTY="/>
        <attribute name="edited" value="VkQxO0RFU0tUT1AtSzE0UVJDMjsyMDIxLTAzLTAxOzA2OjMzOjM1IEFNOzU7MjYxMg=="/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <output expression="&quot;Masukkan Bulan&quot;" newline="True"/>
            <declare name="bulan" type="Integer" array="False" size=""/>
            <input variable="bulan"/>
            <if expression="bulan =1">
                <then>
                    <output expression="&quot;Januari-Februari-Maret-April&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =2">
                <then>
                    <output expression="&quot;Februari-Maret-April-Mei&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =3">
                <then>
                    <output expression="&quot;Maret-April-Mei-Juni&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =4">
                <then>
                    <output expression="&quot;April-Mei-Juni-Juli&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =5">
                <then>
                    <output expression="&quot;Mei-Juni-Juli-Agustus&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =6">
                <then>
                    <output expression="&quot;Juni, Juli, Agustus, September&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =7">
                <then>
                    <output expression="&quot;Juli, Agustus, September, Oktober&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =8">
                <then>
                    <output expression="&quot;Agustus, September, Oktober, November&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =9">
                <then>
                    <output expression="&quot;September, Oktober, November, Desember&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =10">
                <then>
                    <output expression="&quot;Oktober, November, Desember, Januari&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =11">
                <then>
                    <output expression="&quot;November, Desember, Januari, Februari&quot;" newline="True"/>
                </then>
                <else/>
            </if>
            <if expression="bulan =12">
                <then>
                    <output expression="&quot;Desember, Januari, Februari, Maret&quot;" newline="True"/>
                </then>
                <else/>
            </if>
        </body>
    </function>
</flowgorithm>
        
    }

}
